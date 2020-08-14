package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

import org.apache.commons.lang.RandomStringUtils;
import toolkit.Tools;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    @FXML
    private JFXTextField tfApplicationId;

    @FXML
     private JFXComboBox<String> cmbTitle;

    @FXML
    private JFXTextField tfFirstName;

    @FXML
    private JFXTextField tfMiddleName;

    @FXML
    private JFXTextField tfLastName;

    @FXML
    private JFXComboBox<String> cmbMaritalStatus;

    @FXML
    private JFXDatePicker dpBirthDate;

    @FXML
    private JFXTextField tfBirthLocation;

    @FXML
    private JFXTextField tfCardHolderFirstName;

    @FXML
    private JFXTextField tfCardHolderMiddleName;

    @FXML
    private JFXTextField tfCardHolderLastName;

    @FXML
    private JFXTextField tfNameOnCard;

    @FXML
    private JFXComboBox<String> cmbFirstAddressType;

    @FXML
    private JFXTextField tfFirstAddressLine1;

    @FXML
    private JFXTextField tfFirstAddressCity;

    @FXML
    private JFXTextField tfFirstAddressPhone1;

    @FXML
    private JFXTextField tfPrimaryCard;

    @FXML
    private ToggleGroup PrimaryOrSecondary;

    @FXML
    private JFXComboBox<String> cmbCardHolderTitle;

    ObservableList<String> title = FXCollections.observableArrayList("Mr","Miss","Mrs","Dr","Eng.","H.E","Messrs");
    ObservableList<String> maritalStatus = FXCollections.observableArrayList("Single","Married","Divorced","Widower","Seperated");
    ObservableList<String> addressType = FXCollections.observableArrayList("Civil Id","Passport","Driver License", "Employee Id",
            "Residence Card","Family Book","Social Sec. Num." );



    @FXML
    void onSubmit(ActionEvent event) {
        //validate if all compulsory fields not null


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

     tfApplicationId.setText(RandomStringUtils.random(20, true, true));
        //cmbTitle.getItems().addAll("hjg","gfhjk");
        //cmbFirstAddressType.setItems(addressType);
       // cmbMaritalStatus.setItems(maritalStatus);
        //cmbCardHolderTitle.setItems(title);

       // cmbMaritalStatus.getSelectionModel().selectFirst();
       // cmbFirstAddressType.getSelectionModel().selectFirst();
      //  cmbCardHolderTitle.getSelectionModel().selectFirst();
      //  cmbTitle.getSelectionModel().selectFirst();

    }
}
