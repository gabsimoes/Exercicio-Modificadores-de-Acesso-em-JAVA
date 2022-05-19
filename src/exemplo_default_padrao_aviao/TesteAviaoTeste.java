package exemplo_default_padrao_aviao;

import exemplo_default_padrao.Aviao;
//ap�s mudar a classe para public novamente, importamos a classe

public class TesteAviaoTeste {

	public static void main(String[] args) {
		Aviao A320;
		A320 = new Aviao();
		
//N�o � poss�vel instanciar um objeto da classe 
//Aviao que est� em outro pacote,
//pois a classe Aviao n�o est� public
		
		A320.fabricante = "EADS Airbus";
		
		//A320. -n�o consegue utilizar o m�todo imprimirOi porque o void n�o � public
		
		System.out.println("Fabricante " + A320.fabricante);
	}

}
