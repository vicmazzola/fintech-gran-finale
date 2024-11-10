package br.com.fiap.fintechfinplus.trabalho_fintech.controller;


import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ContaDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ContaDaoImpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Conta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/conta") // URL mapping para este servlet
    public class ContaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ContaDao contaDao;

    public ContaServlet() {
        contaDao = new ContaDaoImpl(); // Inicializa a implementação do DAO
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Coleta os dados enviados pelo formulário
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        String tipoConta = request.getParameter("tipoConta");
        double saldo = Double.parseDouble(request.getParameter("saldo"));

        // Cria uma nova conta e configura os dados
        Conta novaConta = new Conta();
        novaConta.setIdCliente(idCliente);
        novaConta.setTipoConta(tipoConta);
        novaConta.setSaldo(saldo);

        // Usa o DAO para inserir a nova conta no banco de dados
        try {
            contaDao.inserir(novaConta);
            response.sendRedirect("sucesso.jsp"); // Redireciona para uma página de sucesso
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("erro", "Erro ao criar conta: " + e.getMessage());
            request.getRequestDispatcher("erro.jsp").forward(request, response); // Redireciona para uma página de erro
        }
    }

    // Implementação para o método doGet se necessário, por exemplo para listar contas
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Conta> contas = contaDao.listar();
        request.setAttribute("contas", contas);
        request.getRequestDispatcher("Conta.jsp").forward(request, response); // Encaminha para conta.jsp
    }

}
