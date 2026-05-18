package LSP;

public class Main {
    public static void main(String[] args) {
        // Todas as subclasses são usadas no lugar da classe Produto sem causar problemas
        Produto produto1 = new Pizza("Margherita", 49.90, "Grande");
        Produto produto2 = new Hamburguer("X-Bacon", 32.00, true);
        Produto produto3 = new Bebida("Coca-Cola", 8.00, "350ml");

        // Chamada polimórfica — funciona corretamente para todos os tipos
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();
    }
}
