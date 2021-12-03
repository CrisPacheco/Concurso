package concurso;

import java.util.Scanner;

public class Jugador {

    public String nombre;

    public String agregarJugador() {

        System.out.println("POR FAVOR INGRESE SU NOMBRE:");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.println("");
        return nombre;
    }
}
