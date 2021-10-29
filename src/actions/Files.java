package actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import actions.Events;

public class Files {
	
	private File arquivo;

	@FXML
	private TextArea txtImportar;

	@FXML
	private TextArea txtConsulta;

	@FXML
	private TextArea txtImportarEstrutura;

	@FXML
	private TextArea txtHsitorico;

	@FXML
	private TextArea txtVinculo;

	@FXML
	private TextArea txtExcluir;

	@FXML
	private TextArea txtPis;
	
	// Metodo botao Selecionar Arquivo Importar PIS Pessoa
		@FXML
		void selecionaArquivoImportarPisPessoa(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar o vinculo do PIS as pessoas");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtPis.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtHsitorico.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impPisPessoas();
			}

		}

		// Metodo botao Selecionar Arquivo Inativar Pessoa
		@FXML
		void selecionaArquivoInativarPessoa(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a inativalções das pessoas");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtHsitorico.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//pessoasInativar(event);
			}

		}

		// Metodo botao Selecionar Arquivo Excluir Pessoa
		@FXML
		void selecionaArquivoExlcuirPessoa(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a exclusão das pessoas");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//pessoasAexcluir(event);
			}

		}

		// Metodo botao Selecionar Arquivo Papel Estrutura
		@FXML
		void selecionaArquivoPapel(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a importação dos Papeis");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impEstruturaPapel();
			}

		}

		// Metodo botao Selecionar Arquivo Grupo Estrutura
		@FXML
		void selecionaArquivoGrupo(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a importação dos Grupos");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impEstruturaGrupo();
			}

		}

		// Metodo botao Selecionar Arquivo Pessoas
		@FXML
		void selecionaArquivoPessoas(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a importação das pessoas");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impPessoas();
			}

		}

		// Metodo botao Selecionar Arquivo Papel Pessoas
		@FXML
		void selecionaArquivoPapelPessoas(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar o vinculo do papel a pessoa");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impPessoasPapel();
			}

		}

		// Metodo botao Selecionar Arquivo Cracha Pessoas
		@FXML
		void selecionaArquivoCrachaPessoas(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar o vinculo do crachá a pessoa");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impPessoasCracha();
			}

		}

		// Metodo botao Selecionar Arquivo Grupo Pessoas
		@FXML
		void selecionaArquivoGrupoPessoas(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar o vinculo do grupo a pessoa");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//impPessoasGrupo();
			}

		}

		// Metodo botao Selecionar Arquivo Remover Pessoas Grupo
		@FXML
		void selecionaArquivoExcluirPessoasgrupo(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar a remoção do grupo da pessoa");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//removePessoasGrupo(event);
			}

		}

		// Metodo botao Selecionar Arquivo Atualizar papel Pessoa
		@FXML
		void selecionaArquivoAtualizaPapel(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Selecione o arquivo para iniciar atualização do historico de papel pessoa");
			fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivo texto", "*.txt"));
			// fileChooser.showOpenDialog(null);

			arquivo = fileChooser.showOpenDialog(null);
			if (arquivo != null) {
				txtImportar.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtExcluir.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtVinculo.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtImportarEstrutura.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				txtHsitorico.setText("Arquivo Selecionado: " + arquivo.getAbsolutePath());
				//atualizaPapel(event);
			}

		}
		
		/////////////////////////// Metodo Pega o
		/////////////////////////// PDF//////////////////////////////////////////////////////////
		public void getPegaoPDFeColocaNoC() throws IOException {
			InputStream from = getClass().getResourceAsStream("/layouts/Leiame.pdf"); // Criar pacote e colocar nele o .pdf
			try {
				File to = new File("c:\\temp\\Leiame.pdf"); // Endereço de saída do arquivo .pdf
				OutputStream transferByteByByte = new FileOutputStream(to);
				byte[] bufferTotal = new byte[1024];
				int size = 0;
				while ((size = from.read(bufferTotal)) > 0) {
					transferByteByByte.write(bufferTotal, 0, size);
				}
				transferByteByByte.close();
				from.close();
			} catch (Exception ex) {
				Events.logEvento(ex.getMessage(), txtImportar);

			}

		}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Metodo botao Abrir Layout Ajuda
		@FXML
		void btAbrirLayout(ActionEvent event) throws Exception {

			getPegaoPDFeColocaNoC();
			Desktop.getDesktop().open(new File("c:\\temp\\Leiame.pdf"));

		}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		public void getPegaoTXTeColocaNoC() throws IOException {
			InputStream from = getClass().getResourceAsStream("/layouts/layouts.txt"); // Criar pacote e colocar nele o .pdf
			File to = new File("c:\\temp\\layouts.txt"); // Endereço de saída do arquivo .pdf
			OutputStream transferByteByByte = new FileOutputStream(to);
			byte[] bufferTotal = new byte[1024];
			int size = 0;
			while ((size = from.read(bufferTotal)) > 0) {
				transferByteByByte.write(bufferTotal, 0, size);
			}
			transferByteByByte.close();
			from.close();
		}

		// Metodo botao Abrir LayoutPasta
		@FXML
		void btAbrirLayoutPasta(ActionEvent event) throws IOException {

			getPegaoTXTeColocaNoC();
			Desktop.getDesktop().open(new File("c:\\temp\\layouts.txt"));

		}

}
