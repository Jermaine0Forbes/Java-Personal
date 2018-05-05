
package lite;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentController {

    @FXML
    private TextField fx_name;

    @FXML
    private TextField fx_age;

    @FXML
    private Button fx_submit;

    @FXML
    private Button fx_query;

    @FXML
    void onQuery(ActionEvent event) {
    	
    	SQL.query("select * from students");
    }

    @FXML
    void onSubmit(ActionEvent event) {
    	String name = fx_name.getText();
    	String age = fx_age.getText();
    	String values = "insert into students (name,age) values "
    			+ "('"+name+"',"+age+");";
    	
    	SQL.insert(values);
    	fx_name.setText("");
    	fx_age.setText("");
    }

}
