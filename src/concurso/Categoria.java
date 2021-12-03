package concurso;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private final List<Pregunta> preguntas;
    public int puntosTotales;
    private int aciertos;

    public Categoria() {
        this.preguntas = new ArrayList<>();
        puntosTotales = 0;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

    public int mostrarPregunta() {

        int numero = 1;
        int aleatorio = (int) (Math.random() * 5) + 1;
        for (Pregunta p : preguntas) {
            boolean correcta = p.mostrar(numero, aleatorio);
            numero++;
            if (correcta) {
                System.out.println("\t RESPUESTA CORRECTA");
                this.aciertos++;
                puntosTotales += p.getPuntos();
            }
        }
        return this.aciertos;
    }
}
