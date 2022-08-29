package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {


    private String jdbcDriver;
    private String dbUrl;
    private String nameUser;
    private String senhaUsuario;

    private Connection connection;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String nameUser, String senhaUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nameUser = nameUser;
        this.senhaUsuario = senhaUsuario;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nameUser = "sa";
        this.senhaUsuario = "";
    }

    public Connection conectarBancoDados(){
        Connection connection = null;

        try {
            Class.forName(jdbcDriver).newInstance();
            connection = DriverManager.getConnection(dbUrl, nameUser, senhaUsuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
    }

