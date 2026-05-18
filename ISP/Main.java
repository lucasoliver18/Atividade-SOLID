package ISP;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        atendente.criarPedido("Pizza Margherita");
        atendente.cancelarPedido(3);

        System.out.println();

        Entregador entregador = new Entregador();
        entregador.atribuirEntregador("Carlos");
        entregador.rastrearEntrega(1);

        System.out.println();

        Gerente gerente = new Gerente();
        gerente.criarPedido("X-Bacon");
        gerente.atribuirEntregador("Lucas");
        gerente.gerarRelatorio();
        gerente.enviarNotificacao("Sistema funcionando normalmente.");
    }
}
