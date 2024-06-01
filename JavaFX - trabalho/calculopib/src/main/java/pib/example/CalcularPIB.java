package pib.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.net.ConnectException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class CalcularPIB implements Initializable {

    @FXML
    private TableView<Cidade> tblCidade;

    @FXML
    private TableColumn<Cidade, String> idCidade;

    @FXML
    private TableColumn<Cidade, Float> idMediaMensal;

    @FXML
    private TableColumn<Cidade, Integer> idQtdPessoas;

    @FXML
    private TextField txtQtdPessoasCidade;

    @FXML
    private Button btnPIBPais;

    @FXML
    private TextField txtQtdEstados;

    @FXML
    private TextField txtQtdPessoasPais;

    @FXML
    private TextField txtPais;

    @FXML
    private TextField txtRendimentoEstado;

    @FXML
    private TextField txtQtdCidade;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtQtdPessoasEstado;

    @FXML
    private TextField txtRendimentoPais;

    @FXML
    private TextField txtRendimentoCidade;

    @FXML
    private TextField txtEstado;

    @FXML
    private Button btnPIBCidade;

    @FXML
    private Button btnPIBEstado;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idCidade.setCellValueFactory(new PropertyValueFactory<>("nomeRegiao"));
        idQtdPessoas.setCellValueFactory(new PropertyValueFactory<>("qtdPessoas"));
        idMediaMensal.setCellValueFactory(new PropertyValueFactory<>("rendimento"));

        idCidade.setCellFactory(TextFieldTableCell.forTableColumn());
        idQtdPessoas.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idMediaMensal.setCellFactory(TextFieldTableCell.forTableColumn(new FloatStringConverter()));

        idCidade.setOnEditCommit(event -> {
            Cidade cidade = event.getRowValue();
            cidade.setNomeRegiao(event.getNewValue());
            atualizarCidade(cidade);
        });

        idQtdPessoas.setOnEditCommit(event -> {
            Cidade cidade = event.getRowValue();
            cidade.setQtdPessoas(event.getNewValue());
            atualizarCidade(cidade);
        });

        idMediaMensal.setOnEditCommit(event -> {
            Cidade cidade = event.getRowValue();
            cidade.setRendimento(event.getNewValue());
            atualizarCidade(cidade);
        });

        tblCidade.setEditable(true);

        
        carregarDados();
    }

    private void carregarDados() {
        ObservableList<Cidade> cidades = buscarDados();
        tblCidade.setItems(cidades);
    }
    
    private void atualizarCidade(Cidade cidade) {
        DbConnection db = new DbConnection();
        PreparedStatement stmt = null;

        try {
            String sql = "UPDATE cidade SET qtd_pessoas = ?, rendimento_mensal = ?, cidade = ? WHERE cidade = ?";
            stmt = db.prepareStatement(sql);
            stmt.setInt(1, cidade.getQtdPessoas());
            stmt.setFloat(2, cidade.getRendimento());
            stmt.setString(3, cidade.getNomeRegiao());
            stmt.setString(4, cidade.getNomeRegiao()); 

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                db.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    @FXML
    void Deletar(ActionEvent event) {
        Cidade cidadeSelecionada = tblCidade.getSelectionModel().getSelectedItem();
    
        if(cidadeSelecionada != null){
            tblCidade.getItems().remove(cidadeSelecionada);
            deletarCidade(cidadeSelecionada);

        } else{
            System.out.println("Nenhuma cidade selecionada para deletar.");
        }
    }

    private void deletarCidade(Cidade cidade) {
        DbConnection db = new DbConnection();
        PreparedStatement stmt = null;
    
        try {
            String sql = "DELETE FROM cidade WHERE cidade = ?";
            stmt = db.prepareStatement(sql);
            stmt.setString(1, cidade.getNomeRegiao());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                db.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private ObservableList<Cidade> buscarDados() {
        ObservableList<Cidade> cidades = FXCollections.observableArrayList();
        DbConnection db = new DbConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        try {
            String sql = "SELECT cidade, qtd_pessoas, rendimento_mensal FROM cidade";
            stmt = db.prepareStatement(sql);
            rs = stmt.executeQuery();
    
            while (rs.next()) {
                String nomeRegiao = rs.getString("cidade");
                int qtdPessoas = rs.getInt("qtd_pessoas");
                Float rendimento = rs.getFloat("rendimento_mensal");
                Cidade cidade = new Cidade(nomeRegiao, qtdPessoas, rendimento);
                cidades.add(cidade);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }
    
        return cidades;
    }

    @FXML
    void Atualizar(ActionEvent event) {
        carregarDados();
    }
    


    @FXML
    void calcularCidade(ActionEvent event) {

        Cidade c1 = new Cidade(txtCidade.getText(), Integer.parseInt(txtQtdPessoasCidade.getText()),
                Float.parseFloat(txtRendimentoCidade.getText()));

        String nomeCidade = txtCidade.getText();
        int qtdPessoas = Integer.parseInt(txtQtdPessoasCidade.getText());
        Double rendimentoCidade = Double.parseDouble(txtRendimentoCidade.getText());

        InsertSql value = new InsertSql();
        value.insertCidade(qtdPessoas, nomeCidade, rendimentoCidade);

        c1.calcularPib();

    }

    @FXML
    void calcularEstado(ActionEvent event) {

        Estado e1 = new Estado(txtEstado.getText(), Integer.parseInt(txtQtdPessoasEstado.getText()),
                Float.parseFloat(txtRendimentoEstado.getText()), Integer.parseInt(txtQtdCidade.getText()));

        String nomeEstado = txtEstado.getText();
        int mediaPessoas = Integer.parseInt(txtQtdPessoasEstado.getText());
        Double rendimento = Double.parseDouble(txtRendimentoEstado.getText());
        int qtdCidade = Integer.parseInt(txtQtdCidade.getText());

        InsertSql value = new InsertSql();
        value.insertEstado(nomeEstado, qtdCidade, mediaPessoas, rendimento);

        e1.calcularPib();

    }

    @FXML
    void calcularPais(ActionEvent event) {

        Pais p1 = new Pais(txtPais.getText(), Integer.parseInt(txtQtdPessoasPais.getText()),
                Float.parseFloat(txtRendimentoPais.getText()), Integer.parseInt(txtQtdEstados.getText()));

        String nomePais = txtPais.getText();
        int mediaPessoas = Integer.parseInt(txtQtdPessoasPais.getText());
        Double rendimento = Double.parseDouble(txtRendimentoPais.getText());
        int qtdEstado = Integer.parseInt(txtQtdEstados.getText());

        InsertSql value = new InsertSql();
        value.insertPais(nomePais, qtdEstado, mediaPessoas, rendimento);

        p1.calcularPib();
    }

}
