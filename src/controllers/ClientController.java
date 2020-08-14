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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.paint.Color;
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
    private Label lblAlert;

    @FXML
    private JFXComboBox<Title> cmbCardHolderTitle;

    ObservableList<Title> title = FXCollections.observableArrayList(Title.values());
    ObservableList<MaritalStatus> maritalStatus = FXCollections.observableArrayList(MaritalStatus.values());
    ObservableList<AddressType> addressType = FXCollections.observableArrayList(AddressType.values());


    @FXML
    void onSubmit(ActionEvent event) {
        boolean validation = Tools.checkNameLength(tfFirstName.getText()) && Tools.checkNameLength(tfLastName.getText()) && dpBirthDate.getValue() != null && Tools.validDate(dpBirthDate.getValue())
                && Tools.validAddressLength(tfFirstAddressLine1.getText()) && Tools.validBirthLocationLength(tfBirthLocation.getText())
                && Tools.validCityLength(tfFirstAddressCity.getText()) && Tools.validPhoneNumber(tfFirstAddressPhone1.getText())
                && Tools.checkNameLength(tfCardHolderFirstName.getText()) && Tools.checkNameLength(tfCardHolderLastName.getText())
                && Tools.validNameOnCardLength(tfNameOnCard.getText()) && Tools.checkNameLength(tfMiddleName.getText())
                && Tools.checkNameLength(tfCardHolderMiddleName.getText()) && Tools.validCityLength(tfPrimaryCard.getText()) &&
                !tfFirstName.getText().isEmpty() && !tfLastName.getText().isEmpty() && !tfFirstAddressLine1.getText().isEmpty() &&
                !tfFirstAddressPhone1.getText().isEmpty() && !tfCardHolderLastName.getText().isEmpty() && !tfFirstAddressCity.getText().isEmpty()
                && !tfCardHolderFirstName.getText().isEmpty() && !tfNameOnCard.getText().isEmpty();
        if (validation) {


        } else {
            lblAlert.setText("Please Enter all the required fields ");
            lblAlert.setTextFill(Color.RED);

        }

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

        radPrimary.selectedProperty().addListener(observable -> {
            tfPrimaryCard.setDisable(!radPrimary.isSelected());
        });

    }
}
