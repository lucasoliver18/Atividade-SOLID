package DIP;

public class NotificacaoEmail implements INotificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}