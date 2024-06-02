package desafioPoo.iphone.interfaces.funcoes;

import desafioPoo.iphone.interfaces.aparelhoTelefonico.AparelhoTelefonico;
import desafioPoo.iphone.interfaces.navegadorInternet.NavegadorInternet;
import desafioPoo.iphone.interfaces.reprodutorMusical.ReprodutorMusical;

public class Funcoes implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	public void ligar(String numero) {
		System.out.println("LINGANDO PARA: (15) 98888-0000");
	}
	
	public void atender() {
		System.out.println("ATENDENDO A CHAMADA CLEBER...");
	}
	
	public void encerrarChamada() {
		System.out.println("DESLIGANDO A CHAMADA...");
	}
	
	public void iniciarCorreioDeVoz() {
		 System.out.println("ENVIANDO MENSAGEM...");
	}
	 
	public void exibirPagina(String url) {
		System.out.println("ACESSANDO O GOOGLE..."); 
	}
	 
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA...");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA..."); 
	}
	
	public void tocar() {
		System.out.println("TOCANDO...");
	}
	
	public void pausar() {
		System.out.println("PAUSANDO...");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA...");
	}
	
	public void selecionarVideo(String video) {
		System.out.println("SELECIONANDO VÍDEO...");
		
	}
	
}
