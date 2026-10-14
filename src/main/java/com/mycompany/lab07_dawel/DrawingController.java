/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab07_dawel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class DrawingController implements Initializable {


    @FXML
    private RadioButton blackRadioButton;
    @FXML
    private ToggleGroup colorToggleGroup;
    @FXML
    private RadioButton redRadioButton;
    @FXML
    private RadioButton greenRadioButton;
    @FXML
    private RadioButton blueRadioButton;
    @FXML
    private ToggleGroup sizeToggleGroup;
    @FXML
    private Pane drawingAreaPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
