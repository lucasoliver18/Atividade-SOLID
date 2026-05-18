package SRP;

// Responsabilidade: apenas exibir as informações do pedido
public class PedidoRelatorio {
    public void exibir(Pedido pedido) {
        System.out.println("=== Informações do Pedido ===");
        System.out.println("Pedido #:  " + pedido.getId());
        System.out.println("Cliente:   " + pedido.getCliente());
        System.out.println("Item:      " + pedido.getItem());
        System.out.println("Valor:     R$ " + pedido.getValor());
    }
}
