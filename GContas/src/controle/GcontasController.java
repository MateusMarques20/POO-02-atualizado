package controle;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import modelo.Conta;

public class GcontasController implements Initializable {

    @FXML
    private TableColumn<Conta, String> Concessionaria;
    @FXML
    private TableColumn<Conta, String> Descrição;
    @FXML
    private TableColumn<Conta, Date> Vencimento;
    @FXML
    private TableColumn<Conta, TextField> ID;
    @FXML
    private TextField concessionaria;
    @FXML
    private TextField descrição;
    @FXML
    private TextField vencimento;
    @FXML
    private TextField id;
    @FXML
    private Button salva;
    @FXML
    private Button atualizar;
    @FXML
    private Button apagar;
    @FXML
    private Button limpar;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }    

    @FXML
    private void Concessionaria(ActionEvent event){
       
    }

    @FXML
    private void Descrição(ActionEvent event) {
        
    }

    @FXML
    private void Vencimento(ActionEvent event) {
        
    }

    @FXML
    private void ID(ActionEvent event) {
    }

    @FXML
    private void salvar(ActionEvent event) {
    }

    @FXML
    private void atualizar(ActionEvent event) {
    }

    @FXML
    private void apagar(ActionEvent event) {
    }

    @FXML
    private void limpar(ActionEvent event) {
    }
    
}
