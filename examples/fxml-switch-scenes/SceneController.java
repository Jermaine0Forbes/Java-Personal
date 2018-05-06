
package switchy;

import java.io.IOException;
import java.util.HashMap;

import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class SceneController {

	private HashMap<String,String> switchScene = new HashMap<>();

	public SceneController() throws IOException {

		switchScene.put("2", "Scene2.fxml");
		switchScene.put("1", "Scene1.fxml");
	}


    @FXML
    private Button fx_btn;

    @FXML
    void onSwitch(ActionEvent e) throws IOException {


    	String src = switchScene.get("2");
    	Scene s = (Scene)((Node) e.getSource()).getScene();
    	Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
    	s.setRoot(pane);


    }

    @FXML
    private Button fx_btn2;

    @FXML
    void onSwitch2(ActionEvent e) throws IOException {
    	String src = switchScene.get("1");
    	Scene s = (Scene)((Node) e.getSource()).getScene();
    	Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
    	s.setRoot(pane);

    }

}
