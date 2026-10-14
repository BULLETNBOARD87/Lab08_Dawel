/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab07_dawel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class DrawingController implements Initializable {
    
    double currentSize;
    Color currentColor;


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
    private RadioButton smallRadioButton;
    @FXML
    private ToggleGroup sizeToggleGroup;
    @FXML
    private RadioButton mediumRadioButton;
    @FXML
    private RadioButton largeRadioButton;
    @FXML
    private Button undoButton;
    @FXML
    private Button clearButton;
    @FXML
    private Pane drawingAreaPane; 
    @FXML
    private VBox selectionPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        greenRadioButton.setUserData(Color.GREEN);
        blueRadioButton.setUserData(Color.BLUE);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
    }
    
    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
        PenSize selection = (PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
        currentSize = selection.getRadius();
    }
    
    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
        currentColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();  
    }

    @FXML
    private void undoButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().remove(drawingAreaPane.getChildren().size() - 1);
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        Circle ink = new Circle();
        ink.setCenterX(event.getX());
        ink.setCenterY(event.getY());
        ink.setRadius(currentSize);
        ink.setFill(currentColor);
        
        if ((event.getX() >= (selectionPane.getWidth())/15)) {
          drawingAreaPane.getChildren().add(ink);  
        }
    }
    
    private enum PenSize {
      SMALL(2),
      MEDIUM(4),
      LARGE(6);
      
      private final double radius;
      
      PenSize(double radius) {this.radius = radius;}
      public double getRadius() {return radius;}
    };

}
