package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Funcionario;
import org.apache.log4j.Logger;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class FuncionarioDaoImpl implements IDao<Funcionario> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(FuncionarioDaoImpl.class);

    public FuncionarioDaoImpl(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {

        Connection connection = configJDBC.conectarBancoDados();
        Statement statement = null;
        String query = String.format("INSERT INTO funcionarios(nome,sobrenome,cpf, telefone,cargo,acesso)" +
                " VALUES ('%s','%s','%s','%s','%s','%s')",
                funcionario.getNome(), funcionario.getSobrenome(), funcionario.getCpf(),
                funcionario.getTelefone(), funcionario.getCargo(), funcionario.getAcesso());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()){
                funcionario.setId(resultSet.getInt(1));
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        log.debug("Salvando Funcionário: " + funcionario.toString());
        return funcionario;
    }
}
