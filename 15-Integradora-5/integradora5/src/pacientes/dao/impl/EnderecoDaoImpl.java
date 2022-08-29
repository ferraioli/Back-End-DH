package pacientes.dao.impl;

import org.apache.log4j.Logger;
import pacientes.dao.ConfigJDBC;
import pacientes.dao.IDao;
import pacientes.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EnderecoDaoImpl implements IDao<Endereco> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(EnderecoDaoImpl.class);

    public EnderecoDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO enderecos(rua,numero,bairro,cidade) " +
                        "VALUES('%s','%s','%s','%s','%s')",
                endereco.getRua(), endereco.getNumero(), endereco.getBairro(),endereco.getCidade());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getResultSet();
            if (rs.next()){
                endereco.setId(rs.getInt(1));

            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco buscar(Integer id) {
        return null;
    }

    @Override
    public Endereco excluir(Endereco endereco) {
        return null;
    }

    @Override
    public Endereco excluir(Integer id) {
        return null;
    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        return null;
    }
}
