package DIP;

public class NotificacaoSMS implements INotificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}