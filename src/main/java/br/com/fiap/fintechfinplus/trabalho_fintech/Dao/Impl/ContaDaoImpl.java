package br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ContaDao; // Import da interface
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDaoImpl implements ContaDao { // Implementando a interface ContaDao

    @Override

    public void inserir(Conta conta) {
        String sql = "INSERT INTO T_conta (T_CLIENTE_id_cliente, tipo_conta, saldo) VALUES (?, ?, ?)";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, conta.getIdCliente());
            stmt.setString(2, conta.getTipoConta());
            stmt.setDouble(3, conta.getSaldo());

            stmt.executeUpdate();
            System.out.println("Conta inserida com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir conta: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Conta conta) {
        String sql = "UPDATE T_conta SET tipo_conta = ?, saldo = ? WHERE id_conta = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, conta.getTipoConta());
            stmt.setDouble(2, conta.getSaldo());
            stmt.setInt(3, conta.getIdConta());

            stmt.executeUpdate();
            System.out.println("Conta alterada com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao alterar conta: " + e.getMessage());
        }
    }

    @Override
    public void excluir(Conta conta) {
        String sql = "DELETE FROM T_conta WHERE id_conta = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, conta.getIdConta());
            stmt.executeUpdate();
            System.out.println("Conta excluída com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir conta: " + e.getMessage());
        }
    }

    @Override
    public Conta consultarPorId(int id) {
        Conta conta = null;
        String sql = "SELECT id_conta, T_CLIENTE_id_cliente, tipo_conta, saldo FROM T_conta WHERE id_conta = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                conta = new Conta();
                conta.setIdConta(rs.getInt("id_conta"));
                conta.setIdCliente(rs.getInt("T_CLIENTE_id_cliente"));
                conta.setTipoConta(rs.getString("tipo_conta"));
                conta.setSaldo(rs.getDouble("saldo"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao consultar conta: " + e.getMessage());
        }

        return conta;
    }

    @Override
    public List<Conta> listar() {
        List<Conta> contas = new ArrayList<>();
        String sql = "SELECT id_conta, T_CLIENTE_id_cliente, tipo_conta, saldo FROM T_conta";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Conta conta = new Conta();
                conta.setIdConta(rs.getInt("id_conta"));
                conta.setIdCliente(rs.getInt("T_CLIENTE_id_cliente"));
                conta.setTipoConta(rs.getString("tipo_conta"));
                conta.setSaldo(rs.getDouble("saldo"));
                contas.add(conta);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar contas: " + e.getMessage());
        }

        return contas;
    }
}