package defaultPackage.poo;

import defaultPackage.apps.FacebookMessenger;
import defaultPackage.apps.MSNMessenger;
import defaultPackage.apps.ServicoMensagemInstantanea;
import defaultPackage.apps.Telegram;

public class ComputadorPedrinho {
	
	public static void main(String[] args) {
		
//		System.out.println("MSN");
//		MSNMessenger msn = new MSNMessenger();
//		msn.enviarMensagem();
//		msn.receberMensagem();
//		
//		System.out.println("FACEBOOK");
//		FacebookMessenger fcb = new FacebookMessenger();
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
//		
//		System.out.println("TELEGRAM");
//		Telegram tlg = new Telegram();
//		tlg.enviarMensagem();
//		tlg.receberMensagem();
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		}else if(appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();
		}else if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();

	}	
}
