package OCP;

public class ProcessadorPagamento {
    public void processar(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}