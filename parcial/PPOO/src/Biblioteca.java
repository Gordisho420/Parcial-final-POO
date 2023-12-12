import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirLibros() {
        for (Libro libro : libros) {
            libro.imprimirInfo();
            System.out.println();
        }
    }
}

