package LSP;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Pizza("Margherita", 49.90, "Grande");
        Produto produto2 = new Hamburguer("X-Bacon", 32.00, true);
        Produto produto3 = new Bebida("Coca-Cola", 8.00, "350ml");

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();
    }
}