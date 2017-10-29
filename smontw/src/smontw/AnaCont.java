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
public class AnaCont implements Initializable {

    
    @FXML private TextField roll;
    @FXML private TextField as;
    @FXML private TextField nas;
    @FXML private TextField ts;
    @FXML
    private void handlesgoButtonAction(ActionEvent event) {
        try {
            System.out.println("You clicked me!");
            int sn=Integer.parseInt(roll.getText());
            read ob=new read();
            String s=ob.reader(sn);
            String nass=s.substring(s.indexOf("n")+1,s.indexOf("a"));
            String ass=s.substring(s.indexOf("a")+1,s.indexOf("f"));
            String tss=s.substring(s.lastIndexOf("f")+1);
            as.setText(ass);
            nas.setText(nass);
            ts.setText(tss);
            
        } catch (Exception ex) {
            Logger.getLogger(v1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
