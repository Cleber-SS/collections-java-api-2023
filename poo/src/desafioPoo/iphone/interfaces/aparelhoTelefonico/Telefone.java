package desafioPoo.iphone.interfaces.aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("Lingando 15 98888-0000");
	}
	
	public void atender() {
		System.out.println("Atendendo...");
	}
	
	public void encerrarChamada() {
		System.out.println("Desligando a chamada...");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("Encaminhando menssagem...");
	}
}
