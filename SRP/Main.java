package SRP;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "João Silva", "Pizza Margherita", 49.90);

        PedidoRepository repository = new PedidoRepository();
        repository.salvar(pedido);

        PedidoRelatorio relatorio = new PedidoRelatorio();
        relatorio.exibir(pedido);
    }
}