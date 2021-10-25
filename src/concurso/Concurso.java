package concurso;

import java.util.List;

public class Concurso {

    public static void main(String[] args) {

        System.out.println("\tCONCURSO DE PREGUNTAS\nEl concurso consta de 5 categorias, en cada categoria se selecciona una pregunta aleatoria, "
                + "cada categoria es mas dificil que la anterior.\nBUENA SUERTE\n");
        System.out.println("\tPUNTAJES DE LAS PREGUNTAS\nPREGUNTA N°1 = 1000\tCATEGORIA MUYFACIL\nPREGUNTA N°2 = 2000\tCATEGORIA FACIL\nPREGUNTA N°3 = 3000\tCATEGORIA INTERMEDIO\nPREGUNTA N°4 = 4000\tCATEGORIA DIFICIL\nPREGUNTA N°5 = 5000\tCATEGORIA EXPERTO\n");

        Jugador j = new Jugador();
        String jugador = j.agregarJugador();

        Categoria muyFacil = new Categoria();
        muyFacil.agregarPregunta(new Pregunta("¿Cuál es el jugador que más balones de oro ha ganado?", List.of(
                new Respuesta("Leonel Messi", true),
                new Respuesta("Marco van Basten", false),
                new Respuesta("Cristian Ronaldo", false),
                new Respuesta("Ronaldo Nazario", false)
        ), (1000)));

        muyFacil.agregarPregunta(new Pregunta("¿Cuál es el club que más champions league ha ganado?", List.of(
                new Respuesta("Bayer Munich", false),
                new Respuesta("A.C. Milan", false),
                new Respuesta("Real Madrid", true),
                new Respuesta("Manchester United", false)
        ), (1000)));

        muyFacil.agregarPregunta(new Pregunta("¿Cuál es la selección nacional con más mundiales ganados?", List.of(
                new Respuesta("Brasil", true),
                new Respuesta("Argentina", false),
                new Respuesta("Alemania", false),
                new Respuesta("Italia", false)
        ), (1000)));

        muyFacil.agregarPregunta(new Pregunta("¿Cuál de estos jugadores tenía posición de arquero?", List.of(
                new Respuesta("Alessandro Del Piero", false),
                new Respuesta("Thierry Henry", false),
                new Respuesta("Carles Puyol", false),
                new Respuesta("Edwin Van Der Sar", true)
        ), (1000)));

        muyFacil.agregarPregunta(new Pregunta("¿Cuál de estos jugadores tiene el récord de goleador de la selección Colombia?", List.of(
                new Respuesta("Falcao Garcia", true),
                new Respuesta("James Rodriguez", false),
                new Respuesta("Faustino Asprilla", false),
                new Respuesta("Arnoldo Iguaran", false)
        ), (1000)));

        int puntosFinales = muyFacil.getPuntosTotales();
        if (muyFacil.mostrarPregunta() == 0) {
            Puntaje pu = new Puntaje(jugador, puntosFinales);
            pu.perder(jugador, puntosFinales);
        }

        puntosFinales = muyFacil.getPuntosTotales();
        System.out.println("\tTU PUNTAJE ES: " + puntosFinales);
        Puntaje pu = new Puntaje(jugador, puntosFinales);
        pu.retirada(jugador, puntosFinales);

        Categoria facil = new Categoria();
        facil.agregarPregunta(new Pregunta("¿Cuál jugador tiene el récord de más goles anotados en mundiales??", List.of(
                new Respuesta("Ronaldo Nazario", false),
                new Respuesta("Miroslav Klose", true),
                new Respuesta("Gerd Muller", false),
                new Respuesta("Pele", false)
        ), (2000)));

        facil.agregarPregunta(new Pregunta("¿Cuál de estos jugadores ha ganado un mundial con su selección nacional y una champions league con su club?", List.of(
                new Respuesta("Leonel Messi", false),
                new Respuesta("Cristian Ronaldo", false),
                new Respuesta("Ronaldinho Gaucho", true),
                new Respuesta("Diego Maradona", false)
        ), (2000)));

        facil.agregarPregunta(new Pregunta("¿Cuál de estos arqueros no gano el mundial con su selección nacional?", List.of(
                new Respuesta("Iker Casillas", false),
                new Respuesta("Gianluigi Buffon", false),
                new Respuesta("Manuel Neuer", false),
                new Respuesta("Oliver Kahn", true)
        ), (2000)));

        facil.agregarPregunta(new Pregunta("¿Cuál ha sido la fase más alta a la que la selección Colombia ha logrado llegar en los mundiales?", List.of(
                new Respuesta("Octavos de final", false),
                new Respuesta("Cuartos de final", true),
                new Respuesta("Semifinales", false),
                new Respuesta("Fase de grupos", false)
        ), (2000)));

        facil.agregarPregunta(new Pregunta("¿Cuál de estos jugadores, jugo toda su carrera profesional en un solo club?", List.of(
                new Respuesta("Francesco Totti", true),
                new Respuesta("Xavi Hernandez", false),
                new Respuesta("Didier Drogba", false),
                new Respuesta("Raul Gonzalez", false)
        ), (2000)));

        if (facil.mostrarPregunta() == 0) {
            pu.perder(jugador, puntosFinales);
        }

        puntosFinales = muyFacil.getPuntosTotales() + facil.getPuntosTotales();
        System.out.println("\tTU PUNTAJE ES: " + puntosFinales);
        pu.retirada(jugador, puntosFinales);

        Categoria intermedio = new Categoria();
        intermedio.agregarPregunta(new Pregunta("¿Cuál fue la selección nacional que gano el primer mundial?", List.of(
                new Respuesta("Brasil", false),
                new Respuesta("Uruguay", true),
                new Respuesta("Inglaterra", false),
                new Respuesta("Francia", false)
        ), (3000)));

        intermedio.agregarPregunta(new Pregunta("¿Cuál de estos jugadores jugo en el Real Madrid, Barcelona, Inter y Milán?", List.of(
                new Respuesta("Samuel Eto'o", false),
                new Respuesta("Ronaldo Nazario", true),
                new Respuesta("Zlatan Ibrahimovic", false),
                new Respuesta("Luis Figo", false)
        ), (3000)));

        intermedio.agregarPregunta(new Pregunta("¿Cuál de estos países fue la sede para el mundial de 1994?", List.of(
                new Respuesta("Alemania", false),
                new Respuesta("Corea del Sur y Japon", false),
                new Respuesta("Francia", false),
                new Respuesta("Estados Unidos", true)
        ), (3000)));

        intermedio.agregarPregunta(new Pregunta("¿Cuál selección nacional fue la ganadora del mundial 1998?", List.of(
                new Respuesta("Alemania", false),
                new Respuesta("Italia", false),
                new Respuesta("Brasil", false),
                new Respuesta("Francia", true)
        ), (3000)));

        intermedio.agregarPregunta(new Pregunta("¿Cuál de estos jugadores gano el balón de oro en el año 2007?", List.of(
                new Respuesta("Kaka", true),
                new Respuesta("Cristian Ronaldo", false),
                new Respuesta("Leonel Messi", false),
                new Respuesta("Ronaldinho Gaucho", false)
        ), (3000)));

        if (intermedio.mostrarPregunta() == 0) {
            pu.perder(jugador, puntosFinales);
        }

        puntosFinales = muyFacil.getPuntosTotales() + facil.getPuntosTotales() + intermedio.getPuntosTotales();
        System.out.println("\tTU PUNTAJE ES: " + puntosFinales);
        pu.retirada(jugador, puntosFinales);

        Categoria dificil = new Categoria();
        dificil.agregarPregunta(new Pregunta("¿En cuantos mundiales participo Diego Maradona?", List.of(
                new Respuesta("Tres", false),
                new Respuesta("Dos", false),
                new Respuesta("Uno", false),
                new Respuesta("Cuatro", true)
        ), (4000)));

        dificil.agregarPregunta(new Pregunta("¿Cuál de estos jugadores tiene el récord en recibir más tarjetas rojas?", List.of(
                new Respuesta("Sergio Ramos", false),
                new Respuesta("Gennaro Gattuso", false),
                new Respuesta("Gerardo Bedoya", true),
                new Respuesta("Cyril Rool", false)
        ), (4000)));

        dificil.agregarPregunta(new Pregunta("¿Con cuántos jugadores expulsados del mismo equipo se suspende un partido?", List.of(
                new Respuesta("Cuatro", false),
                new Respuesta("Cinco", true),
                new Respuesta("Tres", false),
                new Respuesta("Seis", false)
        ), (4000)));

        dificil.agregarPregunta(new Pregunta("En el 2012 Leonel Messi obtuvo el récord de más goles anotados en un año, ¿Cuantos goles fueron?", List.of(
                new Respuesta("87 goles", false),
                new Respuesta("88 goles", false),
                new Respuesta("91 goles", true),
                new Respuesta("89 goles", false)
        ), (4000)));

        dificil.agregarPregunta(new Pregunta("¿Cuáles de estos clubes tienen más jugadores ganadores del balón de oro?", List.of(
                new Respuesta("Barcelona", true),
                new Respuesta("Real Madrid", false),
                new Respuesta("Juventus", false),
                new Respuesta("A.C. Milan", false)
        ), (4000)));

        if (dificil.mostrarPregunta() == 0) {
            pu.perder(jugador, puntosFinales);
        }
        
        puntosFinales = muyFacil.getPuntosTotales() + facil.getPuntosTotales() + intermedio.getPuntosTotales() + dificil.getPuntosTotales();
        System.out.println("\tTU PUNTAJE ES: " + puntosFinales);
        pu.retirada(jugador, puntosFinales);

        Categoria experto = new Categoria();
        experto.agregarPregunta(new Pregunta("¿Cuál de estos jugadores es el que más veces ha ganado la champions league?", List.of(
                new Respuesta("Paco Gento", true),
                new Respuesta("Alfredo Di Stefano", false),
                new Respuesta("Cristiano Ronaldo", false),
                new Respuesta("Marcos Alonso", false)
        ), (5000)));

        experto.agregarPregunta(new Pregunta("¿Cuál es el jugador más joven en ganar el balón de oro?", List.of(
                new Respuesta("Leonel Messi", false),
                new Respuesta("Ronaldo Nazario", true),
                new Respuesta("Michael Owen", false),
                new Respuesta("George Best", false)
        ), (5000)));

        experto.agregarPregunta(new Pregunta("¿Cuál es el jugador que más lesiones ha sufrido en estos últimos años?", List.of(
                new Respuesta("Marco Reus", false),
                new Respuesta("Abou Diaby", false),
                new Respuesta("Arjen Robben", true),
                new Respuesta("Carles Puyol", false)
        ), (5000)));

        experto.agregarPregunta(new Pregunta("¿Cuál equipo gano la champions league de la temporada 2003 - 2004?", List.of(
                new Respuesta("Liverpool", false),
                new Respuesta("Bayer Munich", false),
                new Respuesta("F.C Porto", true),
                new Respuesta("Real Madrid", false)
        ), (5000)));

        experto.agregarPregunta(new Pregunta("¿Cuál es el jugador que más partidos ha disputado con la selección Colombia?", List.of(
                new Respuesta("David Ospina", true),
                new Respuesta("Carlos Valderrama", false),
                new Respuesta("Mario Alberto Yepez", false),
                new Respuesta("Juan Guillermo Cuadrado", false)
        ), (5000)));

        if (experto.mostrarPregunta() == 0) {
            pu.perder(jugador, puntosFinales);
        }

        puntosFinales = muyFacil.getPuntosTotales() + facil.getPuntosTotales() + intermedio.getPuntosTotales() + dificil.getPuntosTotales() + experto.getPuntosTotales();
        System.out.println("\t FELICIDADES HAS GANADO: \n\t    TU PUNTAJE ES:" + puntosFinales);
        pu.cargarDatos(jugador, puntosFinales);
    }
}
