package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import actions.TaskLogin;
import actions.Token;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import entities.User;
import entities.roles.Roles;

public class Program {

	public final static String URL = "https://platform.senior.com.br/t/senior.com.br";
	public final static String SENIOR_X_URN = "/bridge/1.0/rest/platform";
	public final static String URLPLATAFORMA = "https://platform.senior.com.br/t/senior.com.br/bridge/1.0/rest/platform";
	private Token token = null;
	private TaskLogin conexao;
	private User user = new User();

	@FXML
	private PasswordField txtSenha;
	@FXML
	private TextArea txtImportarEstrutura;
	@FXML
	private TextArea txtVinculo;
	@FXML
	private TextArea txtConsulta;
	@FXML
	private TextArea txtPis;
	@FXML
	private TextArea txtImportar;
	@FXML
	private TextArea txtHsitorico;
	@FXML
	private TextField txtUsuario;
	@FXML
	private TextArea txtExcluir;

	// Metodo botao limpar tela Consulta
	@FXML
	void LimpaTela(ActionEvent event) {
		txtConsulta.clear();
		txtHsitorico.clear();
		txtExcluir.clear();
		txtImportar.clear();
		txtVinculo.clear();
		txtImportarEstrutura.clear();
	}

	@FXML // Metodo Botão Autenticar
	void EntrarAutenticar(ActionEvent event) {
		LimpaTela(event);
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
				actions.Events.logEvento(
						"                                                                                                                                 "
								+ ex.getMessage(),
						txtConsulta);

			}

		} else {
			actions.Events.alertSenha();
		}

	}

	@FXML /////////////////////////////////////////////////////// Busca todas as pesssoas
			/////////////////////////////////////////////////////// cadastradas
	void BuscaPessoas(ActionEvent event) {
		LimpaTela(event);
		try {
			URL getBuscaPessoas_URI = new URL(
					"https://platform.senior.com.br/t/senior.com.br/bridge/1.0/rest/sam/application/entities/person?offset=0&size=200000");
			HttpURLConnection conexao = (HttpURLConnection) getBuscaPessoas_URI.openConnection();
			conexao.setRequestMethod("GET");
			conexao.setRequestProperty("Authorization", token.getToken_type() + " " + token.getAccess_token());
			conexao.setDoOutput(true);
			int responseCode = conexao.getResponseCode();
			int conta = 0;

			switch (responseCode) {

			case 404:
				actions.Events.logEvento(" Comando não encontrado - Erro: " + responseCode, txtConsulta);
				break;

			case 403:
				actions.Events.logEvento(" Operação negada - Erro: " + responseCode, txtConsulta);
				break;

			case 200:
				actions.Events.logEvento("Retorno OK! - Codigo: " + responseCode, txtConsulta);
				break;

			default:
				actions.Events.logEvento(" - Erro: " + responseCode, txtConsulta);
			}

			if (responseCode == HttpURLConnection.HTTP_OK) {
				actions.Events.alertContador();
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(conexao.getInputStream(), "utf-8"));
				StringBuilder resposta = new StringBuilder();
				String buffer = null;
				while ((buffer = bufferedReader.readLine()) != null) {
					resposta.append(buffer.trim());

					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);
					actions.Events.log(
							"                                                                                                           _______________________* Pessoas Cadastradas *_______________________",
							txtConsulta);
					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);

					Gson gson = new Gson();
					entities.person.Person content = gson.fromJson(resposta.toString(), entities.person.Person.class);

					actions.Events.log("Total: " + content.getTotalElements(), txtConsulta);
					actions.Events.log("ID" + " | " + "  Nome", txtConsulta);
					if (content != null) {
						for (entities.person.Content id : content.getContents()) {
							conta++;
							actions.Events.log(id.getId() + ";" + "	" + id.getName() + ";", txtConsulta);
						}
					}
					actions.Events.log("FIM", txtConsulta);
					actions.Events.logEvento("Total de: " + conta + " pessoas cadastradas.", txtConsulta);

				}
				bufferedReader.close();
				conexao.disconnect();

			}
		} catch (Exception ex) {
			actions.Events.logEvento(
					"Erro ao obter os dados do usuário. Entre com usuário e senha, usuário = " + ex.getMessage(),
					txtConsulta);
		}
	}
	/////////////////////////////////////////////////////// Busca todas as pesssoas
	/////////////////////////////////////////////////////// cadastradas

	@FXML /////////////////////////////////////////////////////// Busca todas as pesssoas
			/////////////////////////////////////////////////////// cadastradas 2
	void BuscaPessoas2(ActionEvent event) {
		LimpaTela(event);
		try {
			URL getBuscaPessoas_URI = new URL(
					"https://platform.senior.com.br/t/senior.com.br/bridge/1.0/rest/sam/application/entities/person?offset=0&size=200000");
			HttpURLConnection conexao = (HttpURLConnection) getBuscaPessoas_URI.openConnection();
			conexao.setRequestMethod("GET");
			conexao.setRequestProperty("Authorization", token.getToken_type() + " " + token.getAccess_token());
			conexao.setDoOutput(true);
			int responseCode = conexao.getResponseCode();
			int conta = 0;

			switch (responseCode) {

			case 404:
				actions.Events.logEvento(" Comando não encontrado - Erro: " + responseCode, txtConsulta);
				break;

			case 403:
				actions.Events.logEvento(" Operação negada - Erro: " + responseCode, txtConsulta);
				break;

			case 200:
				actions.Events.logEvento("Retorno OK! - Codigo: " + responseCode, txtConsulta);
				break;

			default:
				actions.Events.logEvento(" - Erro: " + responseCode, txtConsulta);
			}

			if (responseCode == HttpURLConnection.HTTP_OK) {
				actions.Events.alertContador();
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(conexao.getInputStream(), "utf-8"));

				StringBuilder resposta = new StringBuilder();
				String buffer = null;
				while ((buffer = bufferedReader.readLine()) != null) {
					resposta.append(buffer.trim());

					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);
					actions.Events.log(
							"                                                                                                           _______________________* Pessoas Cadastradas *_______________________",
							txtConsulta);
					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);

					Gson gson = new Gson();
					entities.Contain contents = gson.fromJson(resposta.toString(), entities.Contain.class);

					actions.Events.log("Total: " + contents.getTotalElements(), txtConsulta);
					actions.Events.log("ID" + " | " + "  Nome", txtConsulta);
					if (contents != null) {
						for (entities.Person id : contents.getPersons()) {
							conta++;
							actions.Events.log(id.getId() + ";" + "	" + id.getName() + ";", txtConsulta);
						}
					}
					actions.Events.log("FIM", txtConsulta);
					actions.Events.logEvento("Total de: " + conta + " pessoas cadastradas.", txtConsulta);

				}
				bufferedReader.close();
				conexao.disconnect();

			}
		} catch (Exception ex) {
			actions.Events.logEvento(
					"Erro ao obter os dados do usuário. Entre com usuário e senha, usuário = " + ex.getMessage(),
					txtConsulta);
		}
	}
	/////////////////////////////////////////////////////// Busca todas as pesssoas
	/////////////////////////////////////////////////////// cadastradas 2

	@FXML /////////////////////////////////////////////////////// Busca todos os papeis
			/////////////////////////////////////////////////////// cadastrados
	void BuscarPapeis(ActionEvent event) {
		LimpaTela(event);
		try {
			URL getDadosUserTenant_URI = new URL(
					"https://platform.senior.com.br/t/senior.com.br/sam/1.0/role/pagedsearch/all/?page=1&pageSize=5000");
			HttpURLConnection conexao = (HttpURLConnection) getDadosUserTenant_URI.openConnection();
			conexao.setRequestMethod("GET");
			conexao.setRequestProperty("Authorization", token.getToken_type() + " " + token.getAccess_token());
			conexao.setDoOutput(true);
			int responseCode = conexao.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(conexao.getInputStream(), "utf-8"));
				StringBuilder resposta = new StringBuilder();
				String buffer = null;
				while ((buffer = bufferedReader.readLine()) != null) {
					resposta.append(buffer.trim());
					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);
					actions.Events.log(
							"                                                                                                           _______________________* Papéis Cadastrados *_______________________",
							txtConsulta);
					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);

					Gson gson = new Gson();
					Roles[] listPapeis = gson.fromJson(resposta.toString(), Roles[].class);

					for (Roles id : listPapeis) {
						actions.Events.log("ID do Papel: " + id.getId() + ", Nome: " + id.getName()
								+ ", - É de uso provisorio: " + id.isUsesProvisory(), txtConsulta);
					}
					actions.Events.log(
							"********************************************************************************************************************************************************************************************************** ",
							txtConsulta);
				}
				bufferedReader.close();
				conexao.disconnect();
			}
		} catch (Exception ex) {
			actions.Events.logEvento(
					"Erro ao obter os dados do usuário. Entre com usuário e senha, usuário = " + ex.getMessage(),
					txtConsulta);
		}
	}
///////////////////////////////////////////////////////Busca todos os papeis cadastrados
}
