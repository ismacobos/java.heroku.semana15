package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conecxion {
    public Connection connectToDB() {
        Connection connection = null;
        try {
            //Class.forName("org.postgresql.Driver");//localhost
            //connection = DriverManager.getConnection("jdbc:postgresql://engicoders:5432/dbusuario","postgres", "postgres");
            // Por favor conectate a la otra base de datos *****ojo
            connection = DriverManager.getConnection("jdbc:postgresql://ec2-52-205-61-60.compute-1.amazonaws.com:5432/d3of7dsvghkge2","bdgejyxwreecsw", "3b6e96fdf8a3de9e9ad606cbe36c27f637e4e69c7ae6a60b1ba33e7040d5f383");
            if (connection != null) {
                System.out.println("Se estableció la conexión :)");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al conectar a la base.");
            e.printStackTrace();
        }finally {
            return connection;
        }

    }

}
