package Opdracht1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Optional;

public class RegisterController {
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtGebruikersnaam;

    @FXML
    private PasswordField txtWachtwoord;


    @FXML
    private Alert alertError;


    @FXML
    private void btnregistreer(ActionEvent actionEvent) {

        String fout = "";
        if (txtGebruikersnaam.getText() == "") {
            fout += "Naam is verplicht \n";
        }
        if (txtWachtwoord.getText() == "") {
            fout += "Wachtwoord is verplicht \n";
        }
        if (txtEmail.getText() == "") {
            fout += "Email is verplicht \n";

        }

        if (fout != "") {
            Alert alert = new Alert(Alert.AlertType.ERROR, fout, ButtonType.OK);
            alert.setTitle("Form Error");
            Optional<ButtonType> result = alert.showAndWait();
        }
    }
}
