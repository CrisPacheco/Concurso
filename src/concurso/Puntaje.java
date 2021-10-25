package concurso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Puntaje {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String respuesta;
    int puntosFinales;
    
    public Puntaje(String respuesta, int puntosFinales) {
        
        this.respuesta = respuesta;
        this.puntosFinales = puntosFinales;
    }
    
    public void cargarDatos(String jugador, int puntosFinales){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Puntaje.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/puntajes", "root", "");
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO jugadores VALUES(null,'" + respuesta + "'," + puntosFinales + ")");
            rs = stmt.executeQuery("SELECT * FROM jugadores");
            rs.next();
            System.out.println("\n\tHISTORIAL DE PUNTAJES");
            do {
                System.out.println(" Nombre: " + rs.getString("nombre") + " Puntaje: " + rs.getString("puntaje"));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Concurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void perder(String jugador, int puntosFinales){
        
        int perder = puntosFinales * 0;
        System.out.println("\tTU PUNTAJE ES: " + perder);
        System.out.println("\t  JUEGO TERMINADO");
        Puntaje pu = new Puntaje(jugador, perder);
        pu.cargarDatos(jugador,perder);
        System.exit(0);
    }
    
    public void retirada(String jugador, int puntosFinales){
        
        System.out.println("\n¿DESEAS CONTINUAR O TE RETIRAS? digita tu opcion\nr) -->Retirarse \ncualquier letra) -->Continuar");
        Scanner sc = new Scanner(System.in);
        char retirar = sc.nextLine().charAt(0);
        if (retirar == 'r') {
            System.out.println("\t   TE RETIRASTE\n\tTU PUNTAJE ES:" + puntosFinales);
            Puntaje pu = new Puntaje(jugador, puntosFinales);
            pu.cargarDatos(jugador,puntosFinales);
            System.exit(0);
        }
    }
}
