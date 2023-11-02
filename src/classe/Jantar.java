package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida prato1 = new Comida("Arroz", 0.5);
		Comida prato2 = new Comida("Feijão", 0.5);
		Comida prato3 = new Comida("Macarrão", 0.5);
		Comida prato4 = new Comida("Carne", 0.5);
		
		Pessoa pessoa = new Pessoa("Pedro Ribeiro", 80.0);
		
		System.out.println(pessoa.toString());
		
		pessoa.comer(prato1);
		
		System.out.println(pessoa.toString());
		
		pessoa.comer(prato2);
		
		System.out.println(pessoa.toString());
		
		pessoa.comer(prato3);
		
		System.out.println(pessoa.toString());
		
		pessoa.comer(prato4);
		
		System.out.println(pessoa.toString());
	}

}
