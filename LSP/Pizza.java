package LSP;

public class Pizza extends Produto {
    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pizza: " + getNome() + " | Tamanho: " + tamanho + " | Preço: R$ " + getPreco());
    }
}