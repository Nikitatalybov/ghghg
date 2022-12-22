package com.example.demonfx;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerGhoul {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Arcane;

    @FXML
    private Button addEnterButton;

    @FXML
    private Button addPasswordButton;

    @FXML
    private Button addRegistrationButton;

    @FXML
    private ImageView imageview;


    public void initialize(URL url, ResourceBundle rb) {
        Image i = new Image(new File("C:\\Users\\talybov.nm\\Downloads").toURI().toString());
        imageview.setImage(i);
    }
}

