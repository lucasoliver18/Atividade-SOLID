package ISP;

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