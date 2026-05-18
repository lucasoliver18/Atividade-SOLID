package OCP;

// Abstração: aberta para extensão, fechada para modificação
public interface Pagamento {
    void pagar(double valor);
}
