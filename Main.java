package ED_253429_253414_U1_CasoPractico;

import java.util.InputMismatchException;
import java.util.Scanner;

class Director {
    private final String nombre;
    private final String nacionalidad;

    public Director(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}

class Pelicula {
    private final String titulo;
    private final String genero;
    private final int duracionMinutos;
    private final Director director;

    public Pelicula(String titulo, String genero, int duracionMinutos, Director director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public Director getDirector() {
        return director;
    }
}

class Cartelera {
    private final Pelicula[] peliculas;

    public Cartelera(Pelicula[] peliculas) {
        this.peliculas = peliculas != null ? peliculas.clone() : new Pelicula[0];
    }

    public Pelicula[] getCartelera() {
        return peliculas.clone();
    }

    public int getCantidadPeliculas() {
        return peliculas.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        Director director1 = new Director("Richard Kelly", "Estados Unidos");
        Director director2 = new Director("Christopher Nolan", "Reino Unido / Estados Unidos");
        Director director3 = new Director("David Fincher", "Estados Unidos");
        Director director4 = new Director("Mark Osborne y John Stevenson", "Estados Unidos / Reino Unido");
        Director director5 = new Director("Ang Lee", "Taiwán");

        Pelicula pelicula1 = new Pelicula("Donnie Darko", "Ciencia ficción, Thriller psicológico, Drama", 113,
                director1);
        Pelicula pelicula2 = new Pelicula("Inception", "Ciencia ficción, Acción, Thriller", 148, director2);
        Pelicula pelicula3 = new Pelicula("Seven (Se7en)", "Thriller policíaco, Misterio, Drama", 127, director3);
        Pelicula pelicula4 = new Pelicula("Kung Fu Panda 1", "Animación, Acción, Comedia, Aventura", 92, director4);
        Pelicula pelicula5 = new Pelicula("Secreto en la montaña (Brokeback Mountain)", "Drama, Romance, Western", 134,
                director5);

        Cartelera cartelera = new Cartelera(new Pelicula[] { pelicula1, pelicula2, pelicula3, pelicula4, pelicula5 });

        System.out.println("--------------------------------");
        System.out.println("Bienvenido a nuestro cine!");
        System.out.println("--------------------------------");
        System.out.println("Cartelera de películas:");

        Pelicula[] listaPeliculas = cartelera.getCartelera();
        for (int idx = 0; idx < listaPeliculas.length; idx++) {
            System.out.println("--------------------------------");
            System.out.println((idx + 1) + ". Título: " + listaPeliculas[idx].getTitulo());
        }

        while (!salir) {
            System.out.println("--------------------------------");
            System.out.println("Desea ver los detalles de alguna pelicula? (1 = Si / 2 = No)");

            try {
                int respuesta = scanner.nextInt();
                if (respuesta == 1) {
                    System.out.print("Ingrese el número de la película que desea ver: ");
                    int opcion = scanner.nextInt();

                    if (opcion >= 1 && opcion <= cartelera.getCantidadPeliculas()) {
                        Pelicula peliculaSeleccionada = listaPeliculas[opcion - 1];
                        System.out.println("--------------------------------");
                        System.out.println("Detalles de la película:");
                        System.out.println("Título: " + peliculaSeleccionada.getTitulo());
                        System.out.println("Género: " + peliculaSeleccionada.getGenero());
                        System.out.println("Duración: " + peliculaSeleccionada.getDuracionMinutos() + " minutos");
                        System.out.println("Director: " + peliculaSeleccionada.getDirector().getNombre());
                        System.out.println(
                                "Nacionalidad del director: " + peliculaSeleccionada.getDirector().getNacionalidad());
                    } else {
                        System.out.println("Opción fuera de rango.");
                    }
                } else if (respuesta == 2) {
                    System.out.println("Gracias por visitar nuestro cine. ¡Hasta luego!");
                    salir = true;
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}