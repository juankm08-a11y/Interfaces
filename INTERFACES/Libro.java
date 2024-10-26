class Libro extends Publicacion implements Prestable {
    private boolean estaPrestado;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.estaPrestado = false;
    }

    @Override
    public void prestar() {
        if (!estaPrestado) {
            estaPrestado = true;
            System.out.println("Libro prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (estaPrestado) {
            estaPrestado = false;
            System.out.println("Libro devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro [Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion + ", Prestado: " + estaPrestado + "]";
    }
}


class Revista extends Publicacion {
    private int numero;

    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista [Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion + ", Número: " + numero + "]";
    }
}