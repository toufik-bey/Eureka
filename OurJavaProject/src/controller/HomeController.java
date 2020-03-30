package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable{
	
	@FXML
	private AnchorPane rootPane;
	
	@FXML
	public void LancerHomePane(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Home.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerSanteQue1(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Sante1.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerSanteQue2(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Sante2.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerSanteQue3(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Sante3.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerSanteQue4(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Sante4.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerSanteQue5(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Sante5.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerIslamQue1(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Islam1.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerIslamQue2(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Islam2.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerIslamQue3(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Islam3.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerIslamQue4(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Islam4.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void LancerIslamQue5(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/vue/Islam5.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	public void informationAlert(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Hello");
		alert.setContentText("Cette application est faite par Amirouche DELMI");
		alert.showAndWait();
	}
	
	@FXML
	public void quitter(ActionEvent event) {
		System.exit(0);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
