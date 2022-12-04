package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selector.Selector;

/**
 *
 * @author guillermogallegogonzalez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Selector primerSelector;
    @FXML
    private Selector segundoSelector;
    @FXML
    private Label labelCambio;
    
    ArrayList<String> lista = new ArrayList<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Collections.addAll(lista, "Lechuga","Arroz","Atún","Pan","Fideos", "Manzana", "Filetes", "Tomate", "Jamón", "Aceite");
        lista.addAll(lista);
        primerSelector.setItems(lista);
        segundoSelector.setItems(lista);
        primerSelector.setOnAction(e -> labelCambio.setText("Pulsado el selector de arriba"));
        segundoSelector.setOnAction(e -> labelCambio.setText("Pulsado el selector de abajo"));
    }    
    
}
