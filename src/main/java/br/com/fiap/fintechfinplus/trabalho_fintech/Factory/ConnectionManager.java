package br.com.fiap.fintechfinplus.trabalho_fintech.Factory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static ConnectionManager connectionManager;

    // Construtor privado para impedir a criação de instâncias externas
    private ConnectionManager() {}

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Carrega o driver do Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Cria a conexão com o banco de dados
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM558215",
                    "281202"
            );

        } catch (ClassNotFoundException e) {
            // Lidar com a exceção quando o driver não é encontrado
            throw new RuntimeException("Driver do Oracle não encontrado.", e);
        } catch (SQLException e) {
            // Lidar com a exceção de SQL
            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
        }

        return conn; // Retorna a conexão estabelecida
    }
}
