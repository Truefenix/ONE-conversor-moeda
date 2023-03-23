package conversor.br.com.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primaryConversor extends Application {
	String cores[] = { "Reais", "Euro", "Libras Esterlinas", "Peso argentino", "Peso Chileno"};
	ComboBox<String> caixaDe = new ComboBox<>();
    ComboBox<String> caixaPara = new ComboBox<>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("CONVERSOR"); // Titulo Acima da tela
		
		primaryStage.setResizable(false); // não deixa aumentar a tela
		
		//primaryStage.setFullScreen(true); // deixa a tela cheia
		//primaryStage.setFullScreenExitHint("Aperte Esc para SAIR da Tela cheia");
		
		// Icone da Tela
		Image icon = new Image("/conversor/br/com/view/logo_conversor.png");
		primaryStage.getIcons().add(icon);
		
		Label labelConversor = new Label("Conversor");
		labelConversor.getStyleClass().add("labelConversor");
		labelConversor.setAlignment(Pos.TOP_CENTER);
		labelConversor.setTranslateY(-30);
		
		Label labelValor = new Label("Valor");
		Button BotaoValor = new Button("Valor");
		
		HBox boxValor = new HBox();
		boxValor.getChildren().add(labelValor);
		boxValor.getChildren().add(BotaoValor);
		boxValor.getStyleClass().add("label");
		boxValor.setAlignment(Pos.CENTER);
		boxValor.setSpacing(80);
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
		
		Button conversorBotao = new Button("CONVERTER");
		conversorBotao.setTranslateY(20);
		conversorBotao.getStyleClass().add("conversorBotao");
		
		Label labelResultado = new Label();
		labelResultado.getStyleClass().add("labelResultado");
		labelResultado.setTranslateY(20);
		// Recebe o resultado
		labelResultado.setText(Integer.toString(0));
		
		VBox boxConversor = new VBox();
		boxConversor.getStyleClass().add("conteudo");
		boxConversor.setAlignment(Pos.CENTER);
		boxConversor.getChildren().add(labelConversor);
		boxConversor.getChildren().add(boxValor);
		boxConversor.getChildren().add(boxDePara);
		boxConversor.getChildren().add(boxBotaoDePara);
		boxConversor.getChildren().add(conversorBotao);
		boxConversor.getChildren().add(labelResultado);
		
		String caminhoCss = getClass()
				.getResource("/conversor/br/com/view/Conversor.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConversor, 375, 500);
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Alkatra");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
