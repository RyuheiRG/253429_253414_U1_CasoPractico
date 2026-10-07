package ED_253429_253414_U1_CasoPractico;

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
