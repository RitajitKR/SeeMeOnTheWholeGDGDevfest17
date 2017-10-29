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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */


public class EnterCont implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private TextField duran;
    @FXML private TextField acco;
    @FXML private TextField real;
    @FXML private TextField durs;
    @FXML private TextField medal;
    @FXML private TextField level;
    @FXML private TextField marks;
    @FXML private TextField marks1;
    @FXML private TextField marks11;
    @FXML private TextField marks111;
    
    @FXML
    private void handlessvButtonAction(ActionEvent event) {
        try {
            System.out.println("You clicked me!");
            stores ob=new stores();
            ob.calkeep(Integer.parseInt(duran.getText()), Integer.parseInt(acco.getText()), Integer.parseInt(real.getText()), Integer.parseInt(durs.getText()), Integer.parseInt(medal.getText()), Integer.parseInt(level.getText()), Integer.parseInt(marks.getText()), Integer.parseInt(marks1.getText()), Integer.parseInt(marks11.getText()), Integer.parseInt(marks111.getText()));
        } catch (Exception ex) {
            Logger.getLogger(v1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
