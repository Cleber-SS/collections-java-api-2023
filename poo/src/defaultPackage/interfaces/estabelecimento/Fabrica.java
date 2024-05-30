package defaultPackage.interfaces.estabelecimento;

import defaultPackage.interfaces.equipamentos.copiadora.Copiadora;
import defaultPackage.interfaces.equipamentos.digitalizadora.Digitalizadora;
import defaultPackage.interfaces.equipamentos.impressora.Impressora;
import defaultPackage.interfaces.equipamentos.impressora.Laserjet;
import defaultPackage.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
