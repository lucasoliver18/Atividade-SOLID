package OCP;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();
        Pagamento dinheiro = new PagamentoDinheiro();

        processador.processar(cartao, 49.90);
        processador.processar(pix, 32.50);
        processador.processar(dinheiro, 20.00);
    }
}
