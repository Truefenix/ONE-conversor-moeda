package br.com.truefenix.cm.visao;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Object[] itens = { "Conversor de Moeda", "Conversor de Temperatura"};
		
	      Object selecionarValor = JOptionPane.showInputDialog(null,
	          "Escolha um item", "Opçao",
	              JOptionPane.QUESTION_MESSAGE, null,
	                  itens, itens [0]); //
	      
	      
	      if(selecionarValor == "Conversor de Moeda") {
	    	  
	    	  @SuppressWarnings("unused")
			String inputValue = JOptionPane.showInputDialog("teste 1");
	      } else if((selecionarValor == "Conversor de Temperatura")) {
	    	  
	    	  @SuppressWarnings("unused")
			String inputValue = JOptionPane.showInputDialog("teste 2");
	      } else {
	    	  
	    	  // exceção
	      }
	}
}
