package DIP;

// Abstração da qual as classes de alto nível devem depender
public interface INotificacao {
    void enviarNotificacao(String mensagem);
}
