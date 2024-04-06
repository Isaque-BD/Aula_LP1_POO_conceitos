import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PcCompleto {

    @FXML
    private TextField txtHeadset;

    @FXML
    private TextField txtMouse;

    @FXML
    private TextField txtFonte;

    @FXML
    private TextField txtMonitor;

    @FXML
    private TextField txtSSD;

    @FXML
    private Button btnMontarPc;

    @FXML
    private Button btnComprar;

    @FXML
    private TextField txtPlacaMae;

    @FXML
    private TextField txtTeclado;

    @FXML
    private TextField txtRam;

    @FXML
    private TextField txtGabinete;

    @FXML
    private TextField txtProcessador;

    @FXML
    void MontarPc(ActionEvent event) {

        ComponentesInternos c1 = new ComponentesInternos(txtMouse.getText(), txtTeclado.getText(), txtMonitor.getText(), txtHeadset.getText(), txtGabinete.getText(), txtProcessador.getText(), txtPlacaMae.getText(), Integer.parseInt(txtRam.getText()), Integer.parseInt(txtSSD.getText()), Integer.parseInt(txtFonte.getText()));

        c1.montarPc();

    }

    @FXML
    void ComprarAsPecas(ActionEvent event) {
        ComponentesInternos c1 = new ComponentesInternos(txtMouse.getText(), txtTeclado.getText(), txtMonitor.getText(), txtHeadset.getText(), txtGabinete.getText(), txtProcessador.getText(), txtPlacaMae.getText(), Integer.parseInt(txtRam.getText()), Integer.parseInt(txtSSD.getText()), Integer.parseInt(txtFonte.getText()));

        c1.comprarPecas();
    }

}
