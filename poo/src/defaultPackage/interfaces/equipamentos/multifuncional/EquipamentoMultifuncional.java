package defaultPackage.interfaces.equipamentos.multifuncional;

import defaultPackage.interfaces.equipamentos.copiadora.Copiadora;
import defaultPackage.interfaces.equipamentos.digitalizadora.Digitalizadora;
import defaultPackage.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL.");
	}
	
	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL.");
	}
	
	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL.");
	}
	
}
