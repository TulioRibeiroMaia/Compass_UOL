package avaliacao.exercicio2.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooleDataSource = new ComboPooledDataSource();
        comboPooleDataSource.setJdbcUrl("jdbc:mysql://localhost/FILME?useTimezone=true&serverTimezone=UTC");
        comboPooleDataSource.setUser("root");
        comboPooleDataSource.setPassword("CompassoUOL");

        comboPooleDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooleDataSource;
    }

    public Connection recuperarConexao() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
