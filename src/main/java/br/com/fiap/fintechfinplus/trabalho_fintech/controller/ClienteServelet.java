package br.com.fiap.fintechfinplus.trabalho_fintech.controller;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.ClienteDao;
import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ClienteDaoimpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/cliente")
public class ClienteServelet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("Nome");
        String Date_nascimento = req.getParameter("Date_nascimento");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("Email");
        String endereco = req.getParameter("Endereco");


        // Cria e configura o objeto Cliente
        Cliente cliente = new Cliente();

        cliente.setNome(nome);

        cliente.setDate_nascimento(Date_nascimento); // Define a data de nascimento

        cliente.setTelefone(telefone);

        cliente.setEmail(email);

        cliente.setEndereco(endereco);

        // chamar o ClienteDao
        ClienteDaoimpl clienteDao = new ClienteDaoimpl();
        clienteDao.cadastrar(cliente);
            System.out.println("Cliente cadastrado com sucesso.");

            req.setAttribute("mensagem","Cliente cadastrado com sucesso.");
        req.getRequestDispatcher("/Cliente-list.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cliente> clientes = new ArrayList<>();
        ClienteDaoimpl clienteDao = new ClienteDaoimpl();
        clientes = clienteDao.getAll();
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("/Cliente-list.jsp").forward(req, resp);
    }
}

