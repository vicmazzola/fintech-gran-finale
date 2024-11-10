package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;

import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cartao;

import java.util.List;

public interface CartaoDao {

    void cadastrar(Cartao cartao);
    void excluir(int id);
    List<Cartao> getAll();   // Alterado para getAll
    // Cartao buscarPorId(int id);
}