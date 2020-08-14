package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import enumerations.AddressType;
import enumerations.MaritalStatus;
import enumerations.Title;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
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
     private JFXComboBox<Title> cmbTitle;

    @FXML
    private JFXTextField tfFirstName;

    @FXML
    private JFXTextField tfMiddleName;

    @FXML
    private JFXTextField tfLastName;

    @FXML
    private JFXComboBox<MaritalStatus> cmbMaritalStatus;

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
    private JFXComboBox<AddressType> cmbFirstAddressType;

    @FXML
    private JFXTextField tfFirstAddressLine1;

    @FXML
    private JFXTextField tfFirstAddressCity;

    @FXML
    private JFXTextField tfFirstAddressPhone1;

    @FXML
    private JFXTextField tfPrimaryCard;

    @FXML
    private RadioButton radPrimary;

    @FXML
    private ToggleGroup PrimaryOrSecondary;

    @FXML
    private JFXComboBox<Title> cmbCardHolderTitle;

    ObservableList<Title> title = FXCollections.observableArrayList(Title.values());
    ObservableList<MaritalStatus> maritalStatus = FXCollections.observableArrayList(MaritalStatus.values());
    ObservableList<AddressType> addressType = FXCollections.observableArrayList(AddressType.values());



    @FXML
    void onSubmit(ActionEvent event) {
        //validate if all compulsory fields not null


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

     tfApplicationId.setText(RandomStringUtils.random(20, true, true));
        cmbTitle.setItems(title);
        cmbFirstAddressType.setItems(addressType);
        cmbMaritalStatus.setItems(maritalStatus);
        cmbCardHolderTitle.setItems(title);

        cmbMaritalStatus.getSelectionModel().selectFirst();
        cmbFirstAddressType.getSelectionModel().selectFirst();
        cmbCardHolderTitle.getSelectionModel().selectFirst();
        cmbTitle.getSelectionModel().selectFirst();

    }
}
