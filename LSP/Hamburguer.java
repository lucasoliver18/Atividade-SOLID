package LSP;

public class Hamburguer extends Produto {
    private boolean temBacon;

    public Hamburguer(String nome, double preco, boolean temBacon) {
        super(nome, preco);
        this.temBacon = temBacon;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Hamburguer: " + getNome() + " | Bacon: " + (temBacon ? "Sim" : "Não") + " | Preço: R$ " + getPreco());
    }
}