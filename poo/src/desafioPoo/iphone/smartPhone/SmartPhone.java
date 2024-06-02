package desafioPoo.iphone.smartPhone;

import desafioPoo.iphone.interfaces.aparelhoTelefonico.AparelhoTelefonico;
import desafioPoo.iphone.interfaces.funcoes.Funcoes;
import desafioPoo.iphone.interfaces.navegadorInternet.NavegadorInternet;
import desafioPoo.iphone.interfaces.reprodutorMusical.ReprodutorMusical;

public class SmartPhone {

	public static void main(String[] args) {
		
		Funcoes executar = new Funcoes();
		
		AparelhoTelefonico aparelhoTelefonico = executar;
		NavegadorInternet navegadorInternet = executar;
		ReprodutorMusical reprodutorMusical = executar;
		
		
		aparelhoTelefonico.ligar("");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.encerrarChamada();  
		aparelhoTelefonico.iniciarCorreioDeVoz();
		
		navegadorInternet.exibirPagina("");
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		
		reprodutorMusical.selecionarMusica("");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarVideo("");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
	}
}
