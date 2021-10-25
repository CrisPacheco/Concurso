package concurso;

import java.util.Scanner;

public class Jugador {

    String nombre;
    int puntaje;
        
    public String agregarJugador(){
        
        System.out.println("POR FAVOR INGRESE SU NOMBRE:");
        Scanner sc = new Scanner(System.in);
        String jugador = sc.nextLine();
        System.out.println("");
        return jugador;
    }
}
