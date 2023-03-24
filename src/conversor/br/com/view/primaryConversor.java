package conversor.br.com.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
	String cores[] = {"Reais", "Euro", "Libras Esterlinas", "Peso argentino", "Peso Chileno" };
	private ComboBox<String> caixaDe = new ComboBox<>();
	private ComboBox<String> caixaPara = new ComboBox<>();
	Label labelConversor = new Label("Conversor");
	private Label labelResultado = new Label();
	private TextField textValor = new TextField("0");
	private Button conversorBotao;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("CONVERSOR"); // Titulo Acima da tela

		primaryStage.setResizable(false); // não deixa aumentar a tela

		// primaryStage.setFullScreen(true); // deixa a tela cheia
		// primaryStage.setFullScreenExitHint("Aperte Esc para SAIR da Tela cheia");

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
		caixaDe.getItems().addAll(cores);
		caixaPara.getItems().addAll(cores);
		caixaDe.getStyleClass().add("caixaBox");
		caixaPara.getStyleClass().add("caixaBox");

		HBox boxBotaoDePara = new HBox();
		boxBotaoDePara.getChildren().add(caixaDe);
		boxBotaoDePara.getChildren().add(caixaPara);
		boxBotaoDePara.setAlignment(Pos.CENTER);
		boxBotaoDePara.setSpacing(40);
		boxBotaoDePara.setTranslateY(5);

		// Botão Converter
		converter();
		conversorBotao.setTranslateY(20);
		conversorBotao.getStyleClass().add("conversorBotao");

		labelResultado.getStyleClass().add("labelResultado");
		labelResultado.setTranslateY(20);
		// Recebe o resultado

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
			
			try {
				numero = Double.parseDouble(textValor.getText());
				System.out.println(numero);
				labelConversor.setText("Conversor");

			} catch (NumberFormatException excecao) {
				labelConversor.setText("Enter Only Number...");
			} catch (Exception excecao) {
				System.out.println(excecao);
			}
			//labelResultado.setText(Integer.toString(0));
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
