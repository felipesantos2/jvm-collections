package classes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public double valorTotalEmEstoque() {
        return this.preco * this.quantidade;
    }

    public void novoProdutoQtn(int produto) {
        this.quantidade = produto;
    }

    public void removerProdutoQtn(int produto) {
        this.quantidade - produto;
    }
}
