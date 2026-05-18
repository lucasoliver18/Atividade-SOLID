package LSP;

public class Bebida extends Produto {
    private String volume;

    public Bebida(String nome, double preco, String volume) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Bebida: " + getNome() + " | Volume: " + volume + " | Preço: R$ " + getPreco());
    }
}
