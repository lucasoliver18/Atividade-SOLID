package ISP;

// Interface específica para gerenciamento de pedidos
public interface IGerenciamentoPedido {
    void criarPedido(String item);
    void cancelarPedido(int idPedido);
}
