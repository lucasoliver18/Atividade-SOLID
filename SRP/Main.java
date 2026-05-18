package SRP;

public class Main {
    public static void main(String[] args) {
        // Criação do pedido (responsabilidade do construtor de Pedido)
        Pedido pedido = new Pedido(1, "João Silva", "Pizza Margherita", 49.90);

        // Salvar o pedido (responsabilidade do PedidoRepository)
        PedidoRepository repository = new PedidoRepository();
        repository.salvar(pedido);

        // Exibir o pedido (responsabilidade do PedidoRelatorio)
        PedidoRelatorio relatorio = new PedidoRelatorio();
        relatorio.exibir(pedido);
    }
}
