package defaultPackage.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Mensseger.");	
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Mensseger.\n");
	}
}
