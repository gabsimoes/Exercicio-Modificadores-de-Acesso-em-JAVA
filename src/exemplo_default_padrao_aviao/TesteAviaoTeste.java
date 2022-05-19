package exemplo_default_padrao_aviao;

import exemplo_default_padrao.Aviao;
//após mudar a classe para public novamente, importamos a classe

public class TesteAviaoTeste {

	public static void main(String[] args) {
		Aviao A320;
		A320 = new Aviao();
		
//Não é possível instanciar um objeto da classe 
//Aviao que está em outro pacote,
//pois a classe Aviao não está public
		
		A320.fabricante = "EADS Airbus";
		
		//A320. -não consegue utilizar o método imprimirOi porque o void não é public
		
		System.out.println("Fabricante " + A320.fabricante);
	}

}
