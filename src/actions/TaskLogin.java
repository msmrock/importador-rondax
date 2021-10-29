package actions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.SwingWorker;
import com.google.gson.Gson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import entities.User;
import actions.Events;



public class TaskLogin extends SwingWorker<Token, Void> {
	private URL url;
	private User user;
	private TextArea txtArea;
	private Token token;
	private OkResponse okResponse;
	private ErrorResponse errorResponse;
	private Gson gson = new Gson();
	private String resultado = null;
	private TaskLogin conexao;
	public final static String URL = "https://platform.senior.com.br/t/senior.com.br";
	public final static String SENIOR_X_URN = "/bridge/1.0/rest/platform";
	public final static String URLPLATAFORMA = "https://platform.senior.com.br/t/senior.com.br/bridge/1.0/rest/platform";
	
	@FXML
	private TextArea txtConsulta;
	
	@FXML
	private TextField txtUsuario;

	@FXML
	private PasswordField txtSenha;
	

	public TaskLogin(URL url, User user, TextArea txtArea, Token token) {
		this.url = url;
		this.user = user;
		this.txtArea = txtArea;
		this.token = token;
	}
	
	@Override
	protected Token doInBackground() throws Exception {
		
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
		conexao.setRequestMethod("POST");
		conexao.setRequestProperty("Content-Type", "application/json");
		conexao.setDoOutput(true);
		
		String usuarioJson = gson.toJson(user);

		BufferedWriter bufferedWriter = new BufferedWriter(
				new OutputStreamWriter(conexao.getOutputStream(), "utf-8"));
		bufferedWriter.write(usuarioJson);
		bufferedWriter.close();
		
		int responseCode = conexao.getResponseCode();
		
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(conexao.getInputStream(), "utf-8"));
			StringBuilder resposta = new StringBuilder();
			String buffer = null;
			while ((buffer = bufferedReader.readLine()) != null) {
				resposta.append(buffer.trim());
			}
			bufferedReader.close();
			conexao.disconnect();
			okResponse = gson.fromJson(resposta.toString(), OkResponse.class);
			token = gson.fromJson(okResponse.getJsonToken(), Token.class);
			resultado = ("******  Login realizado. Token: " + token.getAccess_token());
			return token;
			
		} else {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(conexao.getErrorStream(), "utf-8"));
			StringBuilder resposta = new StringBuilder();
			String buffer = null;
			while ((buffer = bufferedReader.readLine()) != null) {
				resposta.append(buffer.trim());
			}
			bufferedReader.close();
			conexao.disconnect();
			errorResponse = gson.fromJson(resposta.toString(), ErrorResponse.class);
			resultado = (errorResponse.getMessage());
			return null;
		}
	}
	
	@Override
	protected void done() {
		if(resultado != null)
			Events.logEvento(resultado, txtArea);
	}
	
	@FXML // Metodo Botão login
	void btEntrarAutentica(ActionEvent event) {
		if (txtUsuario.getText().length() > 0 && txtSenha.getText().length() > 0) {
			user.setUsername(txtUsuario.getText());
			user.setPassword(txtSenha.getText());
			try {
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				actions.Events.log(" ", txtConsulta);
				URL login_URI = new URL(URL + SENIOR_X_URN + "/authentication/actions/login");
				conexao = new TaskLogin(login_URI, user, txtConsulta, token);
				conexao.execute();
				token = conexao.get();

			} catch (Exception ex) {
				actions.Events.logEvento(ex.getMessage(), txtConsulta);

			}

		} else {
		   actions.Events.alertSenha();
		}

	}

}