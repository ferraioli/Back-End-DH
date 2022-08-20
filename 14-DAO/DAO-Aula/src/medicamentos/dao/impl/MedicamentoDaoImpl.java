package medicamentos.dao.impl;

import medicamentos.dao.ConfigJDBC;
import medicamentos.dao.IDao;
import medicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MedicamentoDaoImpl  implements IDao<Medicamento> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoImpl.class);

    public MedicamentoDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) throws SQLException {

        log.info("Salvando um novo medicamento: " + medicamento.toString());
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome,laboratorio,quantidade,preco) VALUES('%s','%s','%s','%s')",
                medicamento.getNome(), medicamento.getLaboratorio(), medicamento.getQuantidade(), medicamento.getPreco());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                medicamento.setId(resultSet.getInt(1));

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) throws SQLException {
        log.info("Buscando medicamento: ");
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("SELECT id,nome, laboratorio, quantidade, preco" +
                " FROM medicamentos where ID = '%s'", id);
        Medicamento medicamento = null;
        try{
            statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Integer idRemedio = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String laboratorio = resultSet.getString("laboratorio");
                Integer quantidade = resultSet.getInt("quantidade");
                Double preco = resultSet.getDouble("preco");
                medicamento = new Medicamento(idRemedio, nome, laboratorio, quantidade, preco);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }
}
