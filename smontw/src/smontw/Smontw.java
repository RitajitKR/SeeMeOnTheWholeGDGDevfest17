/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smontw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Smontw extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("v1.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.setMaxWidth(520);
        stage.setMaxHeight(335);
        stage.setTitle("SeeMeOnTheWhole");
        stage.getIcons().add(new Image("file:F:\\Win10\\programInstall\\NetBeansRR\\NetBeansProjects\\SeeMeOnTheWhole1\\src\\seemeonthewhole1\\icon.png"));
        stage.show();
    }
    public void sstartnew(int i) throws Exception {
        Stage staged=new Stage();
        String s="";
        if(i==1) s="enter.fxml";
        else s="ana.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(s)); 
        Scene scene = new Scene(root);
        staged.setScene(scene);
        staged.setMaxWidth(600);
        staged.setMaxHeight(400);
        staged.setTitle("SeeMeOnTheWhole");
        staged.getIcons().add(new Image("file:F:\\Win10\\programInstall\\NetBeansRR\\NetBeansProjects\\SeeMeOnTheWhole1\\src\\seemeonthewhole1\\icon.png"));

        staged.show();
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
