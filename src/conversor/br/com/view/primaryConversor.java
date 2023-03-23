package conversor.br.com.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primaryConversor extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Conversor");
		labelTitulo.setAlignment(Pos.TOP_CENTER);
		
		Label labelValor = new Label("Valor");
		Button BotaoValor = new Button("Valor");
		
		HBox boxValor = new HBox();
		boxValor.getStyleClass().add("label");
		boxValor.setAlignment(Pos.CENTER);
		boxValor.setSpacing(10);
		boxValor.getChildren().add(labelValor);
		boxValor.getChildren().add(BotaoValor);
		
		Label labelDe = new Label("De");
		Label labelPara = new Label("Para");
		
		HBox boxDePara = new HBox();
		boxDePara.setAlignment(Pos.CENTER);
		boxDePara.setSpacing(10);
		boxDePara.getChildren().add(labelDe);
		boxDePara.getChildren().add(labelPara);
		
		Button deBotao = new Button("De");
		Button paraBotao = new Button("Para");
		
		HBox boxBotaoDePara = new HBox();
		boxBotaoDePara.setSpacing(10);
		boxBotaoDePara.setAlignment(Pos.CENTER);
		boxBotaoDePara.getChildren().add(deBotao);
		boxBotaoDePara.getChildren().add(paraBotao);
		
		Button conversorBotao = new Button("CONVERTER");
		
		Button resultado = new Button("0");
		
		VBox boxConversor = new VBox();
		boxConversor.getStyleClass().add("conteudo");
		boxConversor.setAlignment(Pos.CENTER);
		boxConversor.getChildren().add(labelTitulo);
		boxConversor.getChildren().add(boxValor);
		boxConversor.getChildren().add(boxDePara);
		boxConversor.getChildren().add(boxBotaoDePara);
		boxConversor.getChildren().add(conversorBotao);
		boxConversor.getChildren().add(resultado);
		
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
