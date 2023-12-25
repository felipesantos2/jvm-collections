import java.lang.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 1,2,3,4 };

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Indice -> " + i + " Valor -> " + arr[i]);
        }

        /*
        * Java collections framework
        *
        * Conjunto de estruturas pré-prontas para armazenamento de objetos
        * Uma coleção também é um objeto
        * Algumas operações
        *   - Adição
        *   - Remoção
        *   - Acesso
        *   - Pesquisa
        *   - etc
        *
        * Os três grandes tipos
        * LISTA
        * MAPAS
        *
        *
        * A API COLLECTIONS possui várias classes que representam algumas estruturas de dados
        *
        */

        System.out.println("------------------COLLECTIONS ARRAYLIST-----------------");

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Felipe");
        lista.add("Miguel");
        lista.add("Edileia");
        lista.add( 3, "Florsina");
        lista.add("Lourivaldo");

        System.out.println(lista.size());

        System.out.println(lista.get(4));

        System.out.println(lista.toArray());

    }
}