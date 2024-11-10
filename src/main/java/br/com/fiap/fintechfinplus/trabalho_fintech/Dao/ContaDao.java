package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;

import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Conta;

import java.util.List;

public interface ContaDao {
    void inserir(Conta conta);
    void alterar(Conta conta);
    void excluir(Conta conta);
    Conta consultarPorId(int id);
    List<Conta> listar();
}
