package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException{

        String url = "jdbc:postgresql://localhost:5432/";
        String usuario = "postgres";
        String senha = "123456";


        Connection conexao = DriverManager
                    .getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE curso_java");
    }
}
