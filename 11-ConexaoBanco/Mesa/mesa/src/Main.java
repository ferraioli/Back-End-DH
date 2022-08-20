import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS Formas; CREATE TABLE Formas"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Forma VARCHAR(100) NOT NULL, "
            + " Cor VARCHAR(100) NOT NULL "
            + ")";

    private static final String SQL_INSERT1 = "INSERT INTO Formas (Id ,Forma ,Cor) VALUES (1,'Circulo', 'Vermelho')";
    private static final String SQL_INSERT2 = "INSERT INTO Formas (Id ,Forma ,Cor) VALUES (2,'Circulo', 'Azul')";
    private static final String SQL_INSERT3 = "INSERT INTO Formas (Id ,Forma ,Cor) VALUES (3,'Quadrado', 'Amarelo')";
    private static final String SQL_INSERT4 = "INSERT INTO Formas (Id ,Forma ,Cor) VALUES (4,'Quadrado', 'Vermelho')";
    private static final String SQL_INSERT5 = "INSERT INTO Formas (Id ,Forma ,Cor) VALUES (5,'Quadrado', 'Azul')";

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            statement.execute(SQL_INSERT4);
            statement.execute(SQL_INSERT5);
            showForm(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection != null){
                connection.close();
            }
        }
    }

    public static void showForm(Connection connection) throws SQLException {
        String SQL_Query = "SELECT * FROM Formas Where Forma='Circulo' AND Cor='Vermelho'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_Query);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2)
                    + " - " + resultSet.getString(3));
        }
    }
   public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa", "");
   }
}
