package LSP;

// Classe principal — todas as subclasses devem poder substituí-la sem quebrar o sistema
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}
