package OCP;

public class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Crédito/Débito.");
    }
}