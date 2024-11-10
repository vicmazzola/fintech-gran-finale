package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;

import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Emprestimo;

import java.util.List;

public interface EmprestimoDao {

    // Método para inserir um novo empréstimo
    void registrar(Emprestimo emprestimo);

    // Método para atualizar um empréstimo existente
    void atualizar(Emprestimo emprestimo);

    // Método para deletar um empréstimo pelo ID
    void deletar(int idEmprestimo);

    // Método para buscar um empréstimo pelo ID
    Emprestimo buscarPorId(int idEmprestimo);

    // Método para listar todos os empréstimos
    List<Emprestimo> listarTodos();
}

