import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // collections

        // list - ordenada
        // set - não garante ordem e valores duplicados
        // map - chave e valor

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(3);

        System.out.println(lista.size());
    }
}