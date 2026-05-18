package DIP;

public class Main {
    public static void main(String[] args) {

        INotificacao email = new NotificacaoEmail();
        SistemaDelivery sistemaEmail = new SistemaDelivery(email);
        sistemaEmail.confirmarPedido("João");

        System.out.println();

        INotificacao sms = new NotificacaoSMS();
        SistemaDelivery sistemaSMS = new SistemaDelivery(sms);
        sistemaSMS.pedidoSaiuParaEntrega("Maria");

        System.out.println();

        INotificacao whatsapp = new NotificacaoWhatsApp();
        SistemaDelivery sistemaWhatsApp = new SistemaDelivery(whatsapp);
        sistemaWhatsApp.confirmarPedido("Carlos");
    }
}