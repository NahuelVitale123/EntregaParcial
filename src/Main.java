
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Impresoras impresora = new Impresoras("Impresora", 150, 10, "Juan", 100);
        Notebook notebook = new Notebook("notebook", 200, 20, "Luis", 8);
        Escritorio escritorio = new Escritorio("escritorio", 300, 20, 180, 80);
        Silla silla = new Silla("Silla", 300, 10, 4);


        ArrayList<Productos> lista = new ArrayList<>();

        lista.add(impresora);
        lista.add(notebook);
        lista.add(escritorio);
        lista.add(silla);

        for (Productos productos : lista) System.out.println("Instancia: " + productos);

    }
}