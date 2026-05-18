package ISP;

public class Main {
    public static void main(String[] args) {
        // Atendente só usa o que precisa
        Atendente atendente = new Atendente();
        atendente.criarPedido("Pizza Margherita");
        atendente.cancelarPedido(3);

        System.out.println();

        // Entregador só usa o que precisa
        Entregador entregador = new Entregador();
        entregador.atribuirEntregador("Carlos");
        entregador.rastrearEntrega(1);

        System.out.println();

        // Gerente tem acesso a tudo
        Gerente gerente = new Gerente();
        gerente.criarPedido("X-Bacon");
        gerente.atribuirEntregador("Lucas");
        gerente.gerarRelatorio();
        gerente.enviarNotificacao("Sistema funcionando normalmente.");
    }
}
