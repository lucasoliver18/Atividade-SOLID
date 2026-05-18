package OCP;

// Classe que usa a abstração — não precisa ser alterada para novos tipos de pagamento
public class ProcessadorPagamento {
    public void processar(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}
