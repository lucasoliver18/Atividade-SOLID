package ISP;

// Interface específica para gerenciamento de entregas
public interface IGerenciamentoEntrega {
    void atribuirEntregador(String entregador);
    void rastrearEntrega(int idPedido);
}
