package SRP;

public class Pedido {
    private int id;
    private String cliente;
    private String item;
    private double valor;

    public Pedido(int id, String cliente, String item, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.item = item;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getItem() {
        return item;
    }

    public double getValor() {
        return valor;
    }
}