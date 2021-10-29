package actions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.SwingWorker;
import com.google.gson.Gson;
import javafx.scene.control.TextArea;
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
			resultado = ("                                                                                                                                            Login realizado!!!");
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
			resultado = ("                                                                                                                                 " + errorResponse.getMessage());
			return null;
		}
	}
	
	@Override
	protected void done() {
		if(resultado != null)
			Events.log(resultado, txtArea);
	}


}