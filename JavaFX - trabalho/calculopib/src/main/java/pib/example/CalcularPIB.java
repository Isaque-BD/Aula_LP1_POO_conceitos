package pib.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class CalcularPIB {

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
    


    @FXML
    void calcularCidade(ActionEvent event) {

        Cidade c1 = new Cidade(txtCidade.getText(), Integer.parseInt(txtQtdPessoasCidade.getText()), Float.parseFloat(txtRendimentoCidade.getText()));
        
        
        c1.calcularPib();


    }

    @FXML
    void calcularEstado(ActionEvent event) {

        Estado e1 = new Estado(txtEstado.getText(), Integer.parseInt(txtQtdPessoasEstado.getText()), Float.parseFloat(txtRendimentoEstado.getText()), Integer.parseInt(txtQtdCidade.getText()));

        e1.calcularPib();

    }

    @FXML
    void calcularPais(ActionEvent event) {

        Pais p1 = new Pais(txtPais.getText(), Integer.parseInt(txtQtdPessoasPais.getText()), Float.parseFloat(txtRendimentoPais.getText()), Integer.parseInt(txtQtdEstados.getText()));

        p1.calcularPib();
    }



}

