package ISP;

public class Gerente implements IGerenciamentoPedido, IGerenciamentoEntrega, IRelatorio, INotificacao {
    @Override
    public void criarPedido(String item) {
        System.out.println("Gerente criou o pedido: " + item);
    }

    @Override
    public void cancelarPedido(int idPedido) {
        System.out.println("Gerente cancelou o pedido #" + idPedido);
    }

    @Override
    public void atribuirEntregador(String entregador) {
        System.out.println("Gerente atribuiu o entregador: " + entregador);
    }

    @Override
    public void rastrearEntrega(int idPedido) {
        System.out.println("Gerente rastreando pedido #" + idPedido);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de pedidos gerado com sucesso!");
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada pelo Gerente: " + mensagem);
    }
}