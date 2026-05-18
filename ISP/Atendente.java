package ISP;

public class Atendente implements IGerenciamentoPedido {
    @Override
    public void criarPedido(String item) {
        System.out.println("Pedido criado: " + item);
    }

    @Override
    public void cancelarPedido(int idPedido) {
        System.out.println("Pedido #" + idPedido + " cancelado.");
    }
}