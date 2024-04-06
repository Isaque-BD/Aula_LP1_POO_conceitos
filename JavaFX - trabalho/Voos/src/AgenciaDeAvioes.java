import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AgenciaDeAvioes {

    @FXML
    private TextField txtIdaVolta;

    @FXML
    private TextField txtLocal;

    @FXML
    private TextField txtEmpresa;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private Button btnVoar;

    @FXML
    private TextField txtAssento;

    @FXML
    void irParaOVoo(ActionEvent event) {

        Agencia a1 = new Agencia(Integer.parseInt(txtCPF.getText()), txtNome.getText(), Integer.parseInt(txtAssento.getText()), txtEmpresa.getText(), txtLocal.getText(), txtIdaVolta.getText());

        a1.comprarPassagem();
        a1.irParaOLocal();



    }

}
