package br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.CartaoDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cartao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartaoDaoImpl implements CartaoDao {  // Implements the interface


    @Override
    public void cadastrar(Cartao cartao) {
        String sql = "INSERT INTO t_cartao (id_cartao, t_cliente_id_cliente, numerocartao, validade, limite) " +
                "VALUES (t_cartao_seq.nextval, seq_t_cliente_id_cliente.nextval, ?, TO_DATE(?, 'YYYY-MM-DD'), ?)";


        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cartao.getNumeroCartao()); // número do cartão
            stmt.setDate(2, new java.sql.Date(cartao.getDataValidade().getTime())); // validade
            stmt.setDouble(3, cartao.getLimiteCredito());
            stmt.executeUpdate();
            System.out.println("Cartão cadastrado com sucesso.");


        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cartão: " + e.getMessage());
            if (e.getErrorCode() == 942) { //table or view does not exist
                System.err.println("Tabela T_CARTAO não existe.");
            } else if (e.getErrorCode() == 2291) { // Example: Foreign key violation (check id_conta)
                System.err.println("Violação de chave estrangeira. Verifique o ID da conta.");
            } else if (e.getErrorCode() == 1013) {  //User requested cancel of current operation
                System.err.println("O banco de dados está indisponível.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }

        }


    }

    @Override
    public List<Cartao> getAll() {
        List<Cartao> cartoes = new ArrayList<>();
        String sql = "SELECT * FROM t_cartao";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cartao cartao = new Cartao();
                cartao.setIdCartao(rs.getInt("ID_CARTAO")); // Nome correto
                cartao.setIdConta(rs.getInt("T_CLIENTE_ID_CLIENTE")); // Nome correto
                cartao.setNumeroCartao(rs.getString("NUMEROCARTAO")); // Nome correto
                cartao.setDataValidade(rs.getDate("VALIDADE")); // Nome correto
                cartao.setLimiteCredito((int) rs.getDouble("LIMITE")); // Nome correto, deve ser double se o limite é decimal
                cartoes.add(cartao);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar cartões: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CARTAO não existe."); // Check for correct table name
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
        return cartoes;
    }



    // Other methods... (excluir, buscarPorId)


    public void excluir(int idCartao) { // Adicionando parâmetro para o ID do cartão
        String sql = "DELETE FROM T_CARTAO WHERE id_cartao = ?"; // Usando placeholder

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idCartao); // Define o ID do cartão
            int linhasAfetadas = stmt.executeUpdate(); // Executa a atualização
            System.out.println(linhasAfetadas + " cartão(ns) excluído(s).");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir cartões: " + e.getMessage());
        }
    }


    /*public Cartao buscarPorId(int id) {
        Cartao cartao = null;
        String sql = "SELECT * FROM T_CARTAO WHERE id_cartao = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    cartao = new Cartao();
                    cartao.setIdCartao(rs.getInt("id_cartao"));
                    cartao.setIdConta(rs.getInt("id_conta"));
                    cartao.setNumeroCartao(rs.getString("numero_cartao"));
                    cartao.setDataValidade(rs.getDate("data_validade"));
                    cartao.setLimiteCredito(rs.getInt("limite_credito"));
                }

            }


        } catch (SQLException e) {
            System.err.println("Erro ao buscar cartão por ID: " + e.getMessage());
            if (e.getErrorCode() == 942) { //table or view does not exist
                System.err.println("Tabela T_CARTAO não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }

        }
        return cartao; */

}
