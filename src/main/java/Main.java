import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/profesores"; // Cambia esto por la URL de tu base de datos
        String user = "root";
        String password = "Isaac0114.."; // Cambia esto por tu contraseña real
        String insertSQL = "INSERT INTO profesores (nombre, apellido, fechadenacimiento, genero, estatura, peso, asignatura, idprofesor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(insertSQL)) {


            // Crear un objeto Profesor
            ArrayList<Profesor> profesores = new ArrayList<>();

            profesores.add(new Profesor("Juan", "Velez", "1980-01-01", "Masculino", 1.70, 65, "Materia0", 1));
            profesores.add(new Profesor("Maria", "Gomez", "1985-02-02", "Femenino", 1.65, 60, "Materia1", 2));
            profesores.add(new Profesor("Carlos", "Lopez", "1990-03-03", "Masculino", 1.75, 70, "Materia2", 3));
            profesores.add(new Profesor("Ana", "Martinez", "1995-04-04", "Femenino", 1.60, 55, "Materia3", 4));
            profesores.add(new Profesor("Luis", "Perez", "2000-05-05", "Masculino", 1.80, 75, "Materia4", 5));
            profesores.add(new Profesor("Luis", "Perez", "2000-05-05", "Masculino", 1.80, 75, "Materia4", 6));
            profesores.add(new Profesor("Laura", "Sanchez", "1988-06-06", "Femenino", 1.68, 62, "Materia5", 7));
            profesores.add(new Profesor("Pedro", "Ramirez", "1992-07-07", "Masculino", 1.72, 68, "Materia6", 8));
            profesores.add(new Profesor("Sofia", "Torres", "1983-08-08", "Femenino", 1.64, 58, "Materia7", 9));
            profesores.add(new Profesor("Andres", "Diaz", "1987-09-09", "Masculino", 1.78, 72, "Materia8", 10));
            profesores.add(new Profesor("Isabel", "Hernandez", "1991-10-10", "Femenino", 1.66, 65, "Materia9", 11));
            profesores.add(new Profesor("Javier", "Gonzalez", "1984-11-11", "Masculino", 1.74, 70, "Materia10", 12));
            profesores.add(new Profesor("Claudia", "Morales", "1993-12-12", "Femenino", 1.69, 63, "Materia11", 13));
            profesores.add(new Profesor("Fernando", "Castro", "1986-01-13", "Masculino", 1.77, 73, "Materia12", 14));
            profesores.add(new Profesor("Patricia", "Rojas", "1994-02-14", "Femenino", 1.63, 59, "Materia13", 15));
            profesores.add(new Profesor("Diego", "Vargas", "1989-03-15", "Masculino", 1.71, 67, "Materia14", 16));
            profesores.add(new Profesor("Valentina", "Cruz", "1996-04-16", "Femenino", 1.67, 61, "Materia15", 17));
            profesores.add(new Profesor("Gabriel", "Mendoza", "1982-05-17", "Masculino", 1.73, 69, "Materia16", 18));
            profesores.add(new Profesor("Camila", "Paredes", "1990-06-18", "Femenino", 1.65, 64, "Materia17", 19));
            profesores.add(new Profesor("Sebastian", "Salazar", "1988-07-19", "Masculino", 1.76, 71, "Materia18", 20));
            profesores.add(new Profesor("Andres", "Diaz", "1987-09-09", "Masculino", 1.78, 72, "Materia8", 21));
            profesores.add(new Profesor("Isabel", "Hernandez", "1991-10-10", "Femenino", 1.66, 65, "Materia9", 22));
            profesores.add(new Profesor("Javier", "Gonzalez", "1984-11-11", "Masculino", 1.74, 70, "Materia10", 23));
            profesores.add(new Profesor("Claudia", "Morales", "1993-12-12", "Femenino", 1.69, 63, "Materia11", 24));
            profesores.add(new Profesor("Fernando", "Castro", "1986-01-13", "Masculino", 1.77, 73, "Materia12", 25));
            profesores.add(new Profesor("Patricia", "Rojas", "1994-02-14", "Femenino", 1.63, 59, "Materia13", 26));
            profesores.add(new Profesor("Diego", "Vargas", "1989-03-15", "Masculino", 1.71, 67, "Materia14", 27));
            profesores.add(new Profesor("Valentina", "Cruz", "1996-04-16", "Femenino", 1.67, 61, "Materia15", 28));
            profesores.add(new Profesor("Gabriel", "Mendoza", "1982-05-17", "Masculino", 1.73, 69, "Materia16", 29));
            profesores.add(new Profesor("Camila", "Paredes", "1990-06-18", "Femenino", 1.65, 64, "Materia17", 30));
            profesores.add(new Profesor("Sebastian", "Salazar", "1988-07-19", "Masculino", 1.76, 71, "Materia18", 31));
            profesores.add(new Profesor("Andres", "Diaz", "1987-09-09", "Masculino", 1.78, 72, "Materia8", 32));
            profesores.add(new Profesor("Isabel", "Hernandez", "1991-10-10", "Femenino", 1.66, 65, "Materia9", 33));
            profesores.add(new Profesor("Javier", "Gonzalez", "1984-11-11", "Masculino", 1.74, 70, "Materia10", 34));
            profesores.add(new Profesor("Claudia", "Morales", "1993-12-12", "Femenino", 1.69, 63, "Materia11", 35));
            profesores.add(new Profesor("Fernando", "Castro", "1986-01-13", "Masculino", 1.77, 73, "Materia12", 36));
            profesores.add(new Profesor("Patricia", "Rojas", "1994-02-14", "Femenino", 1.63, 59, "Materia13", 37));
            profesores.add(new Profesor("Diego", "Vargas", "1989-03-15", "Masculino", 1.71, 67, "Materia14", 38));
            profesores.add(new Profesor("Valentina", "Cruz", "1996-04-16", "Femenino", 1.67, 61, "Materia15", 39));
            profesores.add(new Profesor("Gabriel", "Mendoza", "1982-05-17", "Masculino", 1.73, 69, "Materia16", 40));
            profesores.add(new Profesor("Camila", "Paredes", "1990-06-18", "Femenino", 1.65, 64, "Materia17", 41));
            profesores.add(new Profesor("Sebastian", "Salazar", "1988-07-19", "Masculino", 1.76, 71, "Materia18", 42));
            profesores.add(new Profesor("Andres", "Diaz", "1987-09-09", "Masculino", 1.78, 72, "Materia8", 43));
            profesores.add(new Profesor("Isabel", "Hernandez", "1991-10-10", "Femenino", 1.66, 65, "Materia9", 44));
            profesores.add(new Profesor("Javier", "Gonzalez", "1984-11-11", "Masculino", 1.74, 70, "Materia10", 45));
            profesores.add(new Profesor("Claudia", "Morales", "1993-12-12", "Femenino", 1.69, 63, "Materia11", 46));
            profesores.add(new Profesor("Fernando", "Castro", "1986-01-13", "Masculino", 1.77, 73, "Materia12", 47));
            profesores.add(new Profesor("Patricia", "Rojas", "1994-02-14", "Femenino", 1.63, 59, "Materia13", 48));
            profesores.add(new Profesor("Diego", "Vargas", "1989-03-15", "Masculino", 1.71, 67, "Materia14", 49));
            profesores.add(new Profesor("Valentina", "Cruz", "1996-04-16", "Femenino", 1.67, 61, "Materia15", 50));
            profesores.add(new Profesor("Gabriel", "Mendoza", "1982-05-17", "Masculino", 1.73, 69, "Materia16", 51));

            // Insertar cada profesor en la base de datos
            for (Profesor profesor : profesores) {
                stmt.setString(1, profesor.getNombre());
                stmt.setString(2, profesor.getApellido());
                stmt.setString(3, profesor.getFechadenacimiento());
                stmt.setString(4, profesor.getGenero());
                stmt.setDouble(5, profesor.getEstatura());
                stmt.setDouble(6, profesor.getPeso());
                stmt.setString(7, profesor.getAsignatura());
                stmt.setInt(8, profesor.getIdprofesor());

                stmt.executeUpdate();
            }


            System.out.println("=== Lista de Profesores Registrados ===\n");

            for (int i = 0; i < profesores.size(); i++) {
                System.out.println("Profesor #" + (i + 1));
                profesores.get(i).MostrarInfomacion();
                System.out.println("----------------------------");

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

