package controller;

import java.net.URL;

import actions.TaskLogin;
import actions.Token;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Program {

	public final static String URL = "https://platform.senior.com.br/t/senior.com.br";
	public final static String SENIOR_X_URN = "/bridge/1.0/rest/platform";
	public final static String URLPLATAFORMA = "https://platform.senior.com.br/t/senior.com.br/bridge/1.0/rest/platform";
	private Token token = null;
	private TaskLogin conexao;
	private TaskLogin taskLogin;
	
	@FXML // Metodo Botão login
	void EntrarAutenticar(ActionEvent event) {

		}

}
