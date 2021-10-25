package concurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pregunta {

    private final String pregunta;
    private final List<Respuesta> respuestas;
    private static final String letras = "abcd";
    private final int puntos;

    public Pregunta(String pregunta, List<Respuesta> respuestas, int puntos) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.puntos = puntos;
    }

    public Pregunta(String pregunta, int puntos) {
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<>();
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void agregarRespuesta(Respuesta r) {
        this.respuestas.add(r);
    }

    public boolean respuestaCorrecta(char respuesta) {
        
        int indice = letras.indexOf(respuesta);
        if (indice == -1) {
            return false;
        }
        return this.respuestas.get(indice).correcta;
    }

    public boolean mostrar(int numero, int a) {
        
        if (a == numero) {
            System.out.println(this.pregunta);
            int indice = 0;
            for (Respuesta r : this.respuestas) {
                System.out.printf("%c) %s\n", letras.charAt(indice), r.respuesta);
                indice++;
            }
            System.out.println("Elige una de las opciones: ");
            Scanner sc = new Scanner(System.in);
            char respuesta = sc.nextLine().charAt(0);
            return this.respuestaCorrecta(respuesta);
        }
        return false;
    }
}
