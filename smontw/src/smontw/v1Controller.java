/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smontw;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author user
 */
public class v1Controller implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            System.out.println("You clicked me!");
            label.setText("Hello World!");
            Smontw ob=new Smontw();
            ob.sstartnew(1);
        } catch (Exception ex) {
            Logger.getLogger(v1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void handlesButtonAction(ActionEvent event) {
        try {
            System.out.println("You clicked me!");
            label.setText("Hello World!");
            Smontw ob=new Smontw();
            ob.sstartnew(2);
        } catch (Exception ex) {
            Logger.getLogger(v1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
