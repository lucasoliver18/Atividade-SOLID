package SRP;

// Responsabilidade: apenas salvar o pedido
public class PedidoRepository {
    public void salvar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " salvo com sucesso!");
    }
}
