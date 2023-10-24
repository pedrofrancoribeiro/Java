package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		var data2 = new Data();
		
		data1.dia = 2;
		data1.mes = 12;
		data1.ano = 1986;
		
		data2.dia = 24;
		data2.mes = 07;
		data2.ano = 1950;
		
		System.out.println("Data 1: " + data1.obterDataFormatada());
		System.out.println("Data 2: " + data2.obterDataFormatada());
	}

}
