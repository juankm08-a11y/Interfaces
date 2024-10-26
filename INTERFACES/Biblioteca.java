public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("L001", "El Quijote", 1605);
        Revista revista1 = new Revista("R001", "National Geographic", 2023, 10);

        System.out.println(libro1.toString());
        libro1.prestar();
        System.out.println("¿Está prestado el libro? " + libro1.prestado());

        System.out.println(revista1.toString());
    }
}
