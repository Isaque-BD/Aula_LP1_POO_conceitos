import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculo {

    @FXML
    private TextField txtDesconto;

    @FXML
    private Button btnCalcularSalario;

    @FXML
    private TextField txtComissao;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtIdade;


    @FXML
    void salarioTotal(ActionEvent event) {

        CalcSalario c1 = new CalcSalario(
            txtNome.getText(), 
            Integer.parseInt(txtIdade.getText()), 
            Integer.parseInt(txtCPF.getText()),
            Float.parseFloat(txtSalario.getText()),
            Float.parseFloat(txtComissao.getText()),
            Float.parseFloat(txtDesconto.getText())
        );

        
        c1.salarioTotal();




    }

}
