package br.com.fiap.fintechfinplus.trabalho_fintech.Teste;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ContaDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ContaDaoImpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Conta;

import java.util.List;

public class TesteConta {
    public static void main(String[] args) {
        ContaDao contaDao = new ContaDaoImpl();

        // 1. Inserir uma nova conta
        Conta novaConta = new Conta();
        novaConta.setIdCliente(1); // Supondo que o cliente com ID 1 já exista
        novaConta.setTipoConta("Corrente");
        novaConta.setSaldo(1000.00);
        contaDao.inserir(novaConta);

        // 2. Consultar a conta inserida
        List<Conta> contas = contaDao.listar();
        if (!contas.isEmpty()) {
            int idConta = contas.get(0).getIdConta(); // Pegando o ID da primeira conta
            Conta contaConsultada = contaDao.consultarPorId(idConta);
            System.out.println("Conta consultada: " + contaConsultada);
        }

        // 3. Alterar a conta
        if (!contas.isEmpty()) {
            Conta contaAlterar = contas.get(0);
            contaAlterar.setTipoConta("Poupança");
            contaAlterar.setSaldo(1500.00);
            contaDao.alterar(contaAlterar);
            System.out.println("Conta alterada: " + contaDao.consultarPorId(contaAlterar.getIdConta()));
        }

        // 4. Excluir a conta
        if (!contas.isEmpty()) {
            Conta contaExcluir = contas.get(0);
            contaDao.excluir(contaExcluir);
            System.out.println("Conta excluída.");
        }

        // 5. Listar as contas restantes
        List<Conta> contasRestantes = contaDao.listar();
        System.out.println("Contas restantes: " + contasRestantes);
    }
}
