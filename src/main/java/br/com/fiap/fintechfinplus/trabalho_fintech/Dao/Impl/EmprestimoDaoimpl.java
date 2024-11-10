package br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.EmprestimoDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Emprestimo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmprestimoDaoimpl implements EmprestimoDao {
    @Override
    public void registrar(Emprestimo emprestimo) {
        String sql = "INSERT INTO T_EMPRESTIMO (idEmprestimo,  valorEmprestimo, tx_juros, prazo) " +
                "VALUES (SEQ_EMPRESTIMO.NEXTVAL, ?, ?, ?)";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, Emprestimo.getIdEmprestimo());
            stmt.setDouble(2, Emprestimo.getValorEmprestimo());
            stmt.setDouble(3, Emprestimo.getTx_juros());
            stmt.setDouble(4, Emprestimo.getPrazo());

            stmt.executeUpdate();
            System.out.println("novo emprestimo registrado com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao registrar Emprestimo: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_EMPRESTIMO não existe."); // ORA-00942: tabela ou view não existe
            } else if (e.getErrorCode() == 1013) {
                System.err.println("O banco de dados está indisponível."); // Exemplo de erro
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public void atualizar(Emprestimo emprestimo) {

    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM T_EMPRESTIMO WHERE idEmprestimo = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Registro de emprestimo deletado com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir registro de emprestimo: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_EMPRESTIMO não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public Emprestimo buscarPorId(int idEmprestimo) {
        return null;
    }

    @Override
    public List<Emprestimo> listarTodos() {
        return List.of();
    }
}
