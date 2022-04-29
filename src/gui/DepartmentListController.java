package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {

	@FXML
	private TableView<Department> tableViewDepartment;

	@FXML
	private TableColumn<Department, Integer> tableColumnId;

	@FXML
	private TableColumn<Department, Integer> tableColumnName;

	@FXML
	private Button btNew;

	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		try {
			
			Stage stage = (Stage)Main.getMainScene().getWindow();
			tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
			
			tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
			tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}