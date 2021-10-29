package actions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;

public class Events {
	
	// Metodo montar data log
	public static void logEvento(String mensagem, TextArea painel) {
		String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		painel.appendText(dataHora + " - " + mensagem + "\n");
	}

	// Metodo montar log
	public static void log(String mensagem, TextArea painel) {
		painel.appendText(mensagem + "\n");
	}
	
	// Metodo montar data log
	public static void logEvento2(String mensagem, TextArea painel) {
		//String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		painel.appendText( mensagem + "\n" + "\n");
	}
	

	public static void alertSenha() {

		Alerts.showAlert("Aten��o", "Autentica��o", "Entre com o usu�rio e senha", AlertType.WARNING);

	}

	public static void alertEmConstru��o() {

		Alerts.showAlert("Aten��o", "Em desenvolvimento", "!!!!!!!!!!!!!!!!!!", AlertType.WARNING);

	}

	public static void alertContador() {

		Alerts.showAlert("  Aguarde - Buscando Pessoas...", "", " Pesquisa finalizada. ", AlertType.WARNING);

	}

	public static void alertContadorPapeis() {

		Alerts.showAlert("  Aguarde - Buscando Pessoas no papel...", "", " Pesquisa finalizada. ", AlertType.WARNING);

	}

	public static void alertContadorLocais() {

		Alerts.showAlert("  Aguarde - Buscando Locais...", "", " Pesquisa finalizada. ", AlertType.WARNING);

	}
	
	public static void alertCobtadorReset() {

		Alerts.showAlert("  Aguarde - Buscando pessoas no Local...", "", " Niveis e Anti Passback inicializados!!! ", AlertType.WARNING);

	}
	
	public static void alertPessoasPresente() {

		Alerts.showAlert("  Aguarde - Buscando pessoas no Local...", "", " Pesquisa finalizada!!! ", AlertType.WARNING);

	}

	@FXML
	public static void alertSobre() {

		Alerts.showAlert("Sobre o sistema", "Importardor de pesssoas - Ronda Senior X" + "\n" + "Vers�o. 4",
				"Realiza a primeria carga de dados das pessoas na plaformar Senior, importando todas imforma��es basica da pessoa. "
						+ "\n" + "\n" + "Apos importar � possivel, vincular Papel, Crach� e Grupo para pessoa." + "\n"
						+ "\n" + "Importe estrutura de papel , grupo e escala." + "\n" + "\n"
						+ "Finalize o historico de papel e crach�." + "\n" + "\n"
						+ "Remova pessoa de um grupo ou exclua pessoas sem historicos de acesso." + "\n" + "\n"
						+ "Realize a consulta da proprietaria, pessoas, papeis e grupos." + "\n" + "\n"
						+ "Inicialize o Niveil e Anti Passback de uma pessoa ou do local." + "\n" + "\n"
						+ "mario.mainardes@senior.com.br",
				AlertType.INFORMATION);

	}

}
