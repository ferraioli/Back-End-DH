import java.sql.*;

public class Main {


    private static final String sqlCreateTable = "DROP TABLE IF EXISTS CONTA; CREATE TABLE CONTA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOME varchar(100) NOT NULL, "
            + " NUMERO_CONTA INT NOT NULL,"
            + " SALDO INT NOT NULL"
            + " )";

    private static final String sqlInsert1 =  "INSERT INTO CONTA (ID, NOME, NUMERO_CONTA, SALDO) VALUES (?,?,?,?)";
    private static final String sqlUpdate =  "UPDATE CONTA SET SALDO=? WHERE ID=?";


    public static void main(String[] args) throws SQLException {
        Conta conta = new Conta("Matheus", 1234854684, 100000.00);


        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            inserConta(connection, conta);
            updateConta(connection, conta, 1000);
            consultaContas(connection);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void inserConta(Connection connection, Conta conta) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert1);
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, conta.getNome());
        preparedStatement.setInt(3, conta.getNumeroConta());
        preparedStatement.setDouble(4, conta.getSaldo());

        preparedStatement.execute();
    }



    public static void updateConta(Connection connection, Conta conta, int valor) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
        preparedStatement.setDouble(1, conta.getSaldo() + valor);
        preparedStatement.setInt(2, 1);
    }


    public static void consultaContas(Connection connection) throws SQLException {
        String sql = "SELECT * FROM CONTAS";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " | " +
                    resultSet.getString(2) + " | " +
                    resultSet.getInt(3) + " | " +
                    resultSet.getInt(4) + " | " );
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
