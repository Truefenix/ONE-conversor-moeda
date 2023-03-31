package conversor.br.com.view;

import conversor.br.com.controller.ConversaoMoeda;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primaryConversor extends Application {
	private ConversaoMoeda listaMoeda = new ConversaoMoeda();
	private ComboBox<String> caixaDe = new ComboBox<>();
	private ComboBox<String> caixaPara = new ComboBox<>();
	private Label labelConversor = new Label("Conversor");
	private TextField textValor = new TextField("0");
	private Button conversorBotao;
	private Label labelResultado = new Label();

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("CONVERSOR"); // Titulo Acima da tela

		primaryStage.setResizable(false); // n�o deixa aumentar a tela

		//primaryStage.setFullScreen(true); // deixa a tela cheia
		//primaryStage.setFullScreenExitHint("Aperte Esc para SAIR da Tela cheia");

		// Icone da Tela
		Image icon = new Image("/conversor/br/com/view/logo_conversor.png");
		primaryStage.getIcons().add(icon);

		// Titulo
		labelConversor.getStyleClass().add("labelConversor");
		labelConversor.setAlignment(Pos.TOP_CENTER);
		labelConversor.setTranslateY(-30);

		Label labelValor = new Label("Valor");
		textValor.getStyleClass().add("labelText");

		HBox boxValor = new HBox();
		boxValor.getChildren().add(labelValor);
		boxValor.getChildren().add(textValor);
		boxValor.getStyleClass().add("label");
		boxValor.setAlignment(Pos.CENTER);
		boxValor.setSpacing(20);
		boxValor.setTranslateY(-10);

		Label labelDe = new Label("De");
		Label labelPara = new Label("Para");

		HBox boxDePara = new HBox();
		boxDePara.getChildren().add(labelDe);
		boxDePara.getChildren().add(labelPara);
		boxDePara.setAlignment(Pos.CENTER);
		boxDePara.setSpacing(80);
		boxDePara.setTranslateY(5);

		// Caixa BOX
		caixaDe.getItems().addAll(listaMoeda.listaDeMoedas());
		caixaPara.getItems().addAll(listaMoeda.listaDeMoedas());
		caixaDe.getStyleClass().add("caixaBox");
		caixaPara.getStyleClass().add("caixaBox");

		HBox boxBotaoDePara = new HBox();
		boxBotaoDePara.getChildren().add(caixaDe);
		boxBotaoDePara.getChildren().add(caixaPara);
		boxBotaoDePara.setAlignment(Pos.CENTER);
		boxBotaoDePara.setSpacing(40);
		boxBotaoDePara.setTranslateY(5);

		// Bot�o Converter
		converter();
		conversorBotao.setTranslateY(20);
		conversorBotao.getStyleClass().add("conversorBotao");

		// Recebe o resultado
		labelResultado.getStyleClass().add("labelResultado");
		labelResultado.setTranslateY(20);

		VBox boxConversor = new VBox();
		boxConversor.getStyleClass().add("conteudo");
		boxConversor.setAlignment(Pos.CENTER);
		boxConversor.getChildren().add(labelConversor);
		boxConversor.getChildren().add(boxValor);
		boxConversor.getChildren().add(boxDePara);
		boxConversor.getChildren().add(boxBotaoDePara);
		boxConversor.getChildren().add(conversorBotao);
		boxConversor.getChildren().add(labelResultado);

		String caminhoCss = getClass().getResource("/conversor/br/com/view/Conversor.css").toExternalForm();

		Scene cenaPrincipal = new Scene(boxConversor, 375, 500);
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Alkatra");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	private void converter() {
		conversorBotao = new Button("CONVERTER");
		conversorBotao.setOnAction(e -> {
			double numero;
			String listaDe = caixaDe.getValue();
			String listaPara = caixaPara.getValue();
			
			
			try {
				numero = Double.parseDouble(textValor.getText());
				System.out.println(numero);
				labelConversor.setText("Conversor");
				
				// Recebe no texto resultado
				labelResultado.setText(Double.toString(numero));
				
				switch(listaDe) {
				case "Reais":
					System.out.println("Reais");
					
					if(listaPara.equals("Reais")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Dólar")) {
						double realEmDolar = numero * 5.44;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Euro")) {
						double realEmDolar = numero * 5.66;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Libras Esterlinas")) {
						double realEmDolar = numero * 6.41;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso argentino")) {
						double realEmDolar = numero * 0.026;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso Chileno")) {
						double realEmDolar = numero * 0.0065;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				case "D�lar":
					System.out.println("Dólar");
					
					if(listaPara.equals("Dólar")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Reais")) {
						double realEmDolar = numero * 5.25;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Euro")) {
						double realEmDolar = numero * 0.93;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Libras Esterlinas")) {
						double realEmDolar = numero * 0.82;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso argentino")) {
						double realEmDolar = numero * 205.30;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso Chileno")) {
						double realEmDolar = numero * 810.50;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				case "Euro":
					System.out.println("Euro");
					
					if(listaPara.equals("Euro")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Reais")) {
						double realEmDolar = numero * 5.66;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Dólar")) {
						double realEmDolar = numero * 1.08;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Libras Esterlinas")) {
						double realEmDolar = numero * 0.88;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso argentino")) {
						double realEmDolar = numero * 221.30;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso Chileno")) {
						double realEmDolar = numero * 873.68;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				case "ELibras Esterlinas":
					System.out.println("Libras Esterlinas");
					
					if(listaPara.equals("Libras Esterlinas")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Reais")) {
						double realEmDolar = numero * 6.41;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Dólar")) {
						double realEmDolar = numero * 1.22;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Euro")) {
						double realEmDolar = numero * 1.13;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso argentino")) {
						double realEmDolar = numero * 251.02;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso Chileno")) {
						double realEmDolar = numero * 991.00;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				case "Peso argentino":
					System.out.println("Peso argentino");
					
					if(listaPara.equals("Peso argentino")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Reais")) {
						double realEmDolar = numero * 0.026;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Dólar")) {
						double realEmDolar = numero * 0.0049;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Euro")) {
						double realEmDolar = numero * 0.0045;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Libras Esterlinas")) {
						double realEmDolar = numero * 0.0040;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso Chileno")) {
						double realEmDolar = numero * 3.95;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				case "Peso Chileno":
					System.out.println("Peso Chileno");
					
					if(listaPara.equals("Peso Chileno")) {
						labelConversor.setText("Choose different currencies");
						
					} else if(listaPara.equals("Reais")) {
						double realEmDolar = numero * 0.0065;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Dólar")) {
						double realEmDolar = numero * 0.0012;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Euro")) {
						double realEmDolar = numero * 0.0011;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Libras Esterlinas")) {
						double realEmDolar = numero * 0.0010;
						labelResultado.setText(Double.toString(realEmDolar));
						
					} else if(listaPara.equals("Peso argentino")) {
						double realEmDolar = numero * 0.25;
						labelResultado.setText(Double.toString(realEmDolar));
						
					}
					break;
				}

			} catch (NullPointerException excecao) {
				labelConversor.setText("choose a currency");
			} catch (NumberFormatException excecao) {
				labelConversor.setText("Enter Only Number...");
			} catch (Exception excecao) {
				System.out.println(excecao);
			}
			//labelResultado.setText(Double.toString(0));
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
