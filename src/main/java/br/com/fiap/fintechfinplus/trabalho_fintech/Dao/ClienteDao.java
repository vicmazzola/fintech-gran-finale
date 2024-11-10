package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;

import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cliente;

import java.util.List;

public interface ClienteDao {
    void cadastrar(Cliente cliente);
    void excluir(int id);
    List<Cliente> getAll();   // Alterado para getAll
    Cliente buscarPorId(int id);
}
