package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            String url = "jdbc:postgresql://localhost:5432/curso_java";
            String usuario = "postgres";
            String senha = "123456";

            return DriverManager
                    .getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
