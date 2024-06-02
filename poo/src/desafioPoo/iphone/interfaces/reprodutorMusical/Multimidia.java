package desafioPoo.iphone.interfaces.reprodutorMusical;

public class Multimidia implements ReprodutorMusical {

	public void tocar() {
		System.out.println("Tocar.");
		
	}

	public void pausar() {
		System.out.println("Pausar.");
		
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Selecionar música.");
		
	}
	
	public void selecionarVideo(String video) {
		System.out.println("Selecionar video.");
	}
}
