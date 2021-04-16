/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourcemanagementapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author thilr_88qp6ap
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane dashboradpane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickManageLecturers(ActionEvent event) throws IOException {
        
        // when user clicked Manage Lecturers button
        this.dashboradpane.getScene().getWindow().hide();
        
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("lecturers/ManageLecturers.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Lecturers - Resouce Management Application");
        // stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void clickManageSubjects(ActionEvent event) throws IOException {
        // when user clicked Manage Lecturers button
        this.dashboradpane.getScene().getWindow().hide();
        
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("subjects/ManageSubjects.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Subjects - Resouce Management Application");
        // stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void clickManageStudents(ActionEvent event) throws IOException {
        // when user clicked Manage Lecturers button
        this.dashboradpane.getScene().getWindow().hide();
        
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("studentgroup/ManageStudentGroups.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Student - Resouce Management Application");
        // stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void clickManageLocations(ActionEvent event) throws IOException {
        // when user clicked Manage Lecturers button
        this.dashboradpane.getScene().getWindow().hide();
        
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("locations/ManageLocations.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Locations- Resouce Management Application");
        // stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void clickManageTags(ActionEvent event) throws IOException {
        // when user clicked Manage Lecturers button
        this.dashboradpane.getScene().getWindow().hide();
        
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("tags/ManageTags.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Manage Tags - Resouce Management Application");
        stage.show();
    }
    
}
