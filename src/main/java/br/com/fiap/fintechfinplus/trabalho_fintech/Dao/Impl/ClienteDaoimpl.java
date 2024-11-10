package br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ClienteDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoimpl implements ClienteDao {

    @Override
    public void cadastrar(Cliente cliente) {
        String sql = "INSERT INTO T_CLIENTE (ID_CLIENTE, nome, date_nascimento, telefone, email, endereco) " +
                "VALUES (SEQ_CLIENTES.NEXTVAL, ?, ?, ?, ?, ?)";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getDate_nascimento()); // Converter Date para java.sql.Date
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getEndereco());
            stmt.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CLIENTE não existe."); // ORA-00942: tabela ou view não existe
            } else if (e.getErrorCode() == 1013) {
                System.err.println("O banco de dados está indisponível."); // Exemplo de erro
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM T_CLIENTE WHERE ID_CLIENTE = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente excluído com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir cliente: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CLIENTE não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public List<Cliente> getAll() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT ID_CLIENTE, nome, date_nascimento, telefone, email, endereco FROM T_CLIENTE";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("ID_CLIENTE"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDate_nascimento(rs.getString("date_nascimento"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                clientes.add(cliente); // Adiciona cliente à lista
            }

        } catch (SQLException e) {
            System.err.println("Erro ao recuperar todos os clientes: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CLIENTE não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }

        return clientes; // Retorna a lista de clientes
    }

    @Override
    public Cliente buscarPorId(int id) {
        Cliente cliente = null;
        String sql = "SELECT ID_CLIENTE, nome, date_nascimento, telefone, email, endereco FROM T_CLIENTE WHERE ID_CLIENTE = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("ID_CLIENTE"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDate_nascimento(rs.getString("date_nascimento"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar cliente por ID: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CLIENTE não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }

        return cliente;
    }
}