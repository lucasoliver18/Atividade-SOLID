package DIP;

public class SistemaDelivery {
    private INotificacao notificacao;

    public SistemaDelivery(INotificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void confirmarPedido(String cliente) {
        System.out.println("Pedido de " + cliente + " confirmado!");
        notificacao.enviarNotificacao("Olá " + cliente + ", seu pedido foi confirmado e está sendo preparado!");
    }

    public void pedidoSaiuParaEntrega(String cliente) {
        System.out.println("Pedido de " + cliente + " saiu para entrega!");
        notificacao.enviarNotificacao("Olá " + cliente + ", seu pedido saiu para entrega!");
    }
}