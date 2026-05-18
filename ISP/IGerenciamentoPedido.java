package ISP;

public interface IGerenciamentoPedido {
    void criarPedido(String item);
    void cancelarPedido(int idPedido);
}