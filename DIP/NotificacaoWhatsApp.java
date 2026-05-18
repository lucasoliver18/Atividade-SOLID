package DIP;

public class NotificacaoWhatsApp implements INotificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}