interface Prestable {
    void prestar();
    void devolver();
    boolean prestado();
}

abstract class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public abstract String toString();
}