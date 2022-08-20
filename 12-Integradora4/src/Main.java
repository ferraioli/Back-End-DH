
import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios "
            + "("
            + " ID INT PRIMARY KEY,"
            + " Nome varchar(250) NOT NULL, "
            + " Sobrenome varchar(250) NOT NULL, "
            + " Idade INT NOT NULL ,"
            + " Cargo varchar(250) NOT NULL "
            + ")";

    private static final String sqlInsert1 =  "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Cargo) VALUES (1, 'Gasai', 'Yuno', 17, 'Yandere')";
    private static final String sqlInsert2 =  "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Cargo) VALUES (2, 'Patrick', 'Bateman', 35, 'Especialista em fusões')";
    private static final String sqlInsert3 =  "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Cargo) VALUES (3, 'Norman', 'Bates', 27 , 'Filinho da mamãe')";
    private static final String sqlInsert4 =  "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Cargo) VALUES (3, 'Amy', 'Dunne', 32 , 'Divorciada')";

    private static final String sqlDelete =  "DELETE FROM Funcionarios WHERE ID=3";
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            log.info("Tabela criada");

            statement.execute(sqlInsert1);
            log.info("Usuário 1 inserido");
            statement.execute(sqlInsert2);
            log.info("Usuário 2 inserido");
            statement.execute(sqlInsert3);
            log.info("Usuário 3 inserido");
            statement.execute(sqlInsert4);
            log.info("Usuário 4 inserido");

            statement.execute(sqlDelete);
            log.info("Usuário 3 deletado");

        } catch (JdbcSQLIntegrityConstraintViolationException erro) {
            log.error("Primary key repetida");
            erro.printStackTrace();
        } catch (Exception e) {
            log.error("Algo deu ruim");
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }


}
