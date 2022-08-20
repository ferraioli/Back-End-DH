package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Filial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoImpl implements IDao<Filial> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(String.valueOf(FilialDaoImpl.class));

    public FilialDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Filial salvar(Filial filial) {
        Connection connection = configJDBC.conectarBancoDados();
        Statement statement = null;
        String query = String.format("INSERT INTO filiais(nomeFilial,rua,numero, cidade,estado,E5Estrelas)" +
                        " VALUES ('%s','%s','%s','%s','%s','%s')",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(),
                filial.getCidade(), filial.getEstado(), filial.getE5Estrela());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()){
                filial.setId(resultSet.getInt(1));
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("Salvando Filial: "+ filial.toString());
        return filial;
    }
}
