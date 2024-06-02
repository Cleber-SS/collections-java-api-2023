package desafioPoo.iphone.interfaces.navegadorInternet;

public class Google implements NavegadorInternet {
	
	public void exibirPagina(String url) {
		System.out.println("https://www.google.com/");
	}
	
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba.");
	}
	
	public void atualizarPagina() {
		System.out.println("atualizando página.");
	}

}
