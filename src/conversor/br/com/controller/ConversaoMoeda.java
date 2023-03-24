package conversor.br.com.controller;

import conversor.br.com.modelo.Moedas;

public class ConversaoMoeda {
	
	private Moedas moedasLista = new Moedas();
	
	public String[] listaDeMoedas() {
		return moedasLista.getMoedas();
	}
}
