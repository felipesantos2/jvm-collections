

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4 };

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Indice -> " + i + " Valor -> " + arr[i]);
        }

        /*
        * Java collections framework
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

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Felipe");
        lista.add("Miguel");
        lista.add("Edileia");
        lista.add( 6, "Florsina");

        System.out.println("------------------COLLECTIONS-----------------");

        System.out.println(lista.size());

    }
}