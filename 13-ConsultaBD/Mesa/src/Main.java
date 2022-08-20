import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS DENTISTAS; CREATE TABLE DENTISTAS "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOME varchar(100) NOT NULL, "
            + " SOBRENOME varchar(100) NOT NULL,"
            + " MATRICULA varchar(100) NOT NULL NOT NULL"
            + " )";
    private static final String SQL_INSERT =  "INSERT INTO DENTISTAS (ID, NOME, SOBRENOME, MATRICULA) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE =  "UPDATE DENTISTAS SET MATRICULA=? WHERE ID=?";

    public static void main(String[] args) throws SQLException {
        Dentista dentista = new Dentista("Tyler", "Durden", "A54sdefsdas564");
        String novaMatricula =  "dkdokfd64156fddgdf61gdd56f";
        Connection connection=  null;
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            inserirDentista(connection, dentista);
            atualizarMatricula(connection, dentista, novaMatricula);
            consultarMatriculas(connection, dentista);

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection!= null){
                connection.close();
            }
        }
    }

    public static void inserirDentista(Connection connection, Dentista dentista) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2, dentista.getNome());
        preparedStatement.setString(3, dentista.getSobrenome());
        preparedStatement.setString(4, dentista.getMatricula());

        preparedStatement.execute();
    }

    public static void atualizarMatricula(Connection connection, Dentista dentista, String matricula) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setString(1, matricula);
        preparedStatement.setInt(2, 1);
    }

    public static void consultarMatriculas(Connection connection, Dentista dentista) throws SQLException {
        String sqlSelect = "SELECT * FROM CONTA";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " | " +
                    resultSet.getString(2) + " | " +
                    resultSet.getString(3) + " | " +
                    resultSet.getString(4) + " | ");
        };
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }


}
