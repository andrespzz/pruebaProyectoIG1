package pp.bd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.sqlite.SQLiteConfig;

import com.sun.jdi.connect.spi.Connection;

public class AccesoDb {

	private String driver;
	private String url;

	public AccesoDb() {
		FileInputStream fis = null;

		Properties prop = new Properties();

		try {
			fis = new FileInputStream("configuracion.properties");

			prop.load(fis);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public java.sql.Connection getConexion() throws ClassNotFoundException, SQLException {
		Class.forName(driver);

		SQLiteConfig config = new SQLiteConfig();
		config.enforceForeignKeys(true);

		java.sql.Connection con = DriverManager.getConnection(url, config.toProperties());
		System.out.println("Conexi�n establecida con la BBDD");

		return con;

	}

}
