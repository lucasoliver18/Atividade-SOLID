package ISP;

// Entregador só lida com entregas — não implementa o que não usa
public class Entregador implements IGerenciamentoEntrega {
    @Override
    public void atribuirEntregador(String entregador) {
        System.out.println("Entregador " + entregador + " atribuído ao pedido.");
    }

    @Override
    public void rastrearEntrega(int idPedido) {
        System.out.println("Rastreando entrega do pedido #" + idPedido + "...");
    }
}
