package br.com.fiap.fintechfinplus.trabalho_fintech.Teste;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.CartaoDaoImpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Factory.ConnectionManager;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Cartao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class TesteCartao {

    public static void main(String[] args) {
        CartaoDaoImpl cartaoDao = new CartaoDaoImpl();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy"); // Use DateTimeFormatter

        try {
            // Cadastrar novos cartões (Example data - adjust as needed)
            cartaoDao.cadastrar(new Cartao(0, 1, "1234567890123456", Date.valueOf(YearMonth.parse("12-2026", formatter).atEndOfMonth()), 5000));
            cartaoDao.cadastrar(new Cartao(0, 1, "5987572660123456", Date.valueOf(YearMonth.parse("11-2026", formatter).atEndOfMonth()), 551000));


            // List all registered cards
            System.out.println("Lista de Cartões Cadastrados:");
            List<Cartao> cartoes = cartaoDao.getAll();
            cartoes.forEach(System.out::println); // More concise way to print




            // Excluir todos os cartões (use com cuidado!)
        /*    String sql = "DELETE FROM T_CARTAO"; // Comando SQL para excluir todos os registros

            try (Connection conexao = ConnectionManager.getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(sql)) {

                int deletedRows = stmt.executeUpdate(); // Executa a exclusão
                System.out.println(deletedRows + " cartão(s) excluído(s) com sucesso.");

            } catch (SQLException e) {
                System.err.println("Erro ao excluir todos os cartões: " + e.getMessage());
                if (e.getErrorCode() == 942) {
                    System.err.println("Tabela T_CARTAO não existe.");
                } else {
                    System.err.println("Código de erro: " + e.getErrorCode());
                }
            }
            */




        } catch (DateTimeParseException e) { // Catch the specific exception
            System.err.println("Erro ao converter a data: " + e.getMessage());
        }
    }
}

