package classe;

public class ValorNulo {

	public static void main(String[] args) {


		String s1 = "";
		
		System.out.println(s1.concat("!!!"));
		
		
		
		/*Você não pode acessar atributo ou método que está nulo/null
		assim como nã opode acessar variáveis núlas*/
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		
		/*Variável nula não pode ser utilizada: 
		String s2 = null;
		System.out.println(s2.concat("???"));
		*/
	}

}
