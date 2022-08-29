package pacientes.dao.impl;

import org.apache.log4j.Logger;
import pacientes.dao.ConfigJDBC;
import pacientes.dao.IDao;
import pacientes.model.Endereco;
import pacientes.model.Pacientes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;


public class PacienteDaoImpl implements IDao<Pacientes> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(PacienteDaoImpl.class);

    public PacienteDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Pacientes salvar(Pacientes pacientes) {
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO pacientes(nome,sobrenome,rg,dataCadastro) " +
                "VALUES('%s','%s','%s','%s')",
                pacientes.getNome(), pacientes.getSobrenome(), pacientes.getRg(), pacientes.getDataCadastro());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                pacientes.setId(rs.getInt(1));

            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return pacientes;
    }

    @Override
    public Pacientes buscar(Integer id) {
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("SELECT id,nome,sobrenome,rg,dataCadastro, endereco " +
                "FROM medicamentos where ID = '%s'", id);
        Pacientes pacientes = null;
        try {
            statement = connection.createStatement();
           ResultSet rs =  statement.executeQuery(query);
           while (rs.next()){
               Integer idPacientes = rs.getInt("id");
               String  nome= rs.getString("nome");
               String sobrenome = rs.getString("sobrenome");
               String rgPacientes = rs.getString("rg");
               LocalDate dataCadastro = (LocalDate) rs.getObject("dataCadastro");
               Endereco endereco = (Endereco) rs.getObject(String.valueOf(pacientes.getEndereco()));
               pacientes = new Pacientes(idPacientes,nome, sobrenome,rgPacientes, dataCadastro, endereco );
           }
        }catch (Exception e){
            e.printStackTrace();
        }
      return null;

    }

    @Override
    public Pacientes excluir(Pacientes pacientes) {
        return null;
    }

    @Override
    public Pacientes excluir(Integer id) {
        return null;
    }

    @Override
    public Pacientes atualizar(Pacientes pacientes) {
        return null;
    }
}
