package org.afoninav.repository.mysql;

import org.afoninav.model.Developer;
import org.afoninav.repository.DeveloperRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class MySqlDeveloperRepositoryImpl implements DeveloperRepository {
    @Override
    public Developer create() {
        return null;
    }

    @Override
    public Developer readById(Long aLong) {
        return null;
    }

    @Override
    public Developer updateById(Long aLong) {
        return null;
    }

    @Override
    public boolean deleteByID(Long aLong) {
        return false;
    }

    @Override
    public List<Developer> readAll() {
        return null;
    }

    enum SQLQuery {

        CREATE("INSERT INTO developers (first_name, last_name, specialty, status) VALUES (?,?,?,?);"),
        READ_ALL("SELECT * FROM developers;"),
        READ_BY_ID("SELECT * FROM developers AS de WHERE de.developer_id = (?);"),
        UPDATE("UPDATE developers SET first_name=(?), last_name=(?), specialty=(?) WHERE developer_id=(?);"),
        DELETE("DELETE FROM developers WHERE developer_id = (?);");

        final String QUERY;

        SQLQuery(String query){
            this.QUERY = query;
        }
    }

    private static Connection getMySQLConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("testdb");
        String url = resource.getString("URL");
        String login = resource.getString("LOGIN");
        String pass = resource.getString("PASSWORD");
        Connection con = DriverManager.getConnection(url,login,pass);
        return con;
    }
}
