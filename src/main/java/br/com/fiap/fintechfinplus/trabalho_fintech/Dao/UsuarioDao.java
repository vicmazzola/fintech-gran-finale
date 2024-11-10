package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;

import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Usuario;

import java.util.List;

public interface UsuarioDao {
    void cadastrarUsuario(Usuario usuario);
    void excluirUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
}
