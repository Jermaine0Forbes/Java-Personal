package javafx;

import java.awt.Color;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.*;
import javafx.stage.*;
import java.util.function.Function;


public class App_ extends Application {

	@Override
	public void start(Stage window){

		window.setTitle("");
		


		StackPane root = new StackPane();

		Scene scene = new Scene(root,720,480);

		window.setScene(scene);

		window.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
