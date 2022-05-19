package exemplo_default_padrao;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao A320;
		A320 = new Aviao();
		
		A320.fabricante = "EADS Airbus";
		A320.modelo = "AIRBUS A320";
		
		A320.imprimirOi();
		
		System.out.println("Fabricante " + A320.fabricante + "\n Modelo: " + A320.modelo);
	}

}
