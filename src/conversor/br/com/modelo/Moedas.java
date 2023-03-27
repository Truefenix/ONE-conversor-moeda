package conversor.br.com.modelo;

public class Moedas {
	private double reais = 0.19; // 1 real em d�lar
	private double dolares;
	private double euros;
	private double librasEsterlinas;
	private double pesosArgentinos;
	private double pesoChileno;
	
	public String[] getMoedas() {
		String ListaMoedas[] = {"Reais", "Dólar", "Euro", 
				"Libras Esterlinas", "Peso argentino", "Peso Chileno"};
		return ListaMoedas;
	}
}
