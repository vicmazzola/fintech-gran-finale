package br.com.fiap.fintechfinplus.trabalho_fintech.Teste;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ClienteDaoimpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        ClienteDaoimpl clienteDao = new ClienteDaoimpl();

        // Cadastrar novos clientes
        clienteDao.cadastrar(new Cliente(0, "João Silva","28-12-2001", "11987654321", "joao@email.com", "Rua 1, 123"));
        clienteDao.cadastrar(new Cliente(0, "Emanuel Amaral", "01-02-2001", "11987754322", "emanuel@email.com", "Rua 2, 456"));
        clienteDao.cadastrar(new Cliente(0, "Milton Ribeiro", "05-11-1984", "11987154322", "milton@email.com", "Rua 3, 456"));
        clienteDao.cadastrar(new Cliente(0, "Victor Mazzola", "08-11-1997", "11987254322", "victor@email.com", "Rua 4, 456"));

        // Cadastrar um cliente adicional
        Cliente cliente = new Cliente();
        cliente.setIdCliente(0); // O ID será gerado automaticamente pelo banco
        cliente.setNome("Hugo");

        // Converter a string da data para um objeto Date
        String dataNascStr = "28-12-2002";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dataNascimento;



        // Definindo outros atributos
        cliente.setTelefone("11987554321");
        cliente.setEmail("hugo@email.com");
        cliente.setEndereco("Rua 0, Número 456");

        // Cadastrar o cliente
        clienteDao.cadastrar(cliente);


        // Listar todos os clientes cadastrados
        System.out.println("Lista de Clientes Cadastrados:");
        List<Cliente> clientes = clienteDao.getAll();
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getIdCliente() + ", Nome: " + c.getNome() + ", Data de Nascimento: " +
                    c.getDate_nascimento() + ", Telefone: " + c.getTelefone() +
                    ", Email: " + c.getEmail() + ", Endereço: " + c.getEndereco());
        }
 //Abaixo codigo para teste de exclusão de tabelas
        // Excluir todos os clientes cadastrados diretamente no teste
       String sql = "DELETE FROM T_CLIENTE"; // Comando SQL para excluir todos os registros

       try (Connection conexao = ConnectionManager.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {

            int deletedRows = stmt.executeUpdate(); // Executa a exclusão
            System.out.println(deletedRows + " cliente(s) excluído(s) com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao excluir todos os clientes: " + e.getMessage());
            if (e.getErrorCode() == 942) {
                System.err.println("Tabela T_CLIENTE não existe.");
            } else {
                System.err.println("Código de erro: " + e.getErrorCode());
            }
        }



        /*// Listar novamente os clientes para garantir que foram excluídos
        System.out.println("Lista de Clientes Após Exclusão:");
        List<Cliente> clientesAtualizados = clienteDao.getAll();
        if (clientesAtualizados.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente c : clientesAtualizados) {
                System.out.println("ID: " + c.getIdCliente() + ", Nome: " + c.getNome() + ", Data de Nascimento: " +
                        c.getDate_nascimento() + ", Telefone: " + c.getTelefone() +
                        ", Email: " + c.getEmail() + ", Endereço: " + c.getEndereco());
            }
        }
        */
    }
}