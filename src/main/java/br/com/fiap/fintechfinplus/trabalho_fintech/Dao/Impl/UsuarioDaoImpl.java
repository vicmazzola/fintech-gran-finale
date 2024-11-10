package br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.UsuarioDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    @Override
    public void cadastrarUsuario(Usuario usuario) {
        if (usuario.getUsername() == null || usuario.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username não pode ser nulo ou vazio.");
        }
        if (usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
            throw new IllegalArgumentException("Senha não pode ser nula ou vazia.");
        }

        String sql = "INSERT INTO T_usuario (T_CLIENTE_id_cliente, username, senha) VALUES (?, ?, ?)";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, usuario.getIdCliente());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getSenha());

            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_usuario não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public void excluirUsuario(Usuario usuario) {
        String sql = "DELETE FROM T_usuario WHERE id_usuario = ?";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, usuario.getIdUsuario());
            stmt.executeUpdate();
            System.out.println("Usuário excluído com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir usuário: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_usuario não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id_usuario, T_CLIENTE_id_cliente, username, senha FROM T_usuario";

        try (Connection conexao = ConnectionManager.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setIdCliente(rs.getInt("T_CLIENTE_id_cliente"));
                usuario.setUsername(rs.getString("username"));
                usuario.setSenha(rs.getString("senha")); // Não recomendo expor a senha
                usuarios.add(usuario); // Adiciona usuário à lista
            }

        } catch (SQLException e) {
            System.err.println("Erro ao recuperar todos os usuários: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_usuario não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }

        return usuarios; // Retorna a lista de usuários
    }
}
