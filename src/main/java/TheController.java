import com.gluonhq.charm.glisten.control.Avatar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class TheController{



    @FXML
    private Text promptQuestion;

    @FXML
    private Button yesButton;

    @FXML
    private Button noButton;

    @FXML
    private Avatar userAvatar;


    @FXML
    private TextField fullName;

    @FXML
    private TextField displayName;

    @FXML
    private TextField sortableName;

    @FXML
    private TextField pronoun;

    @FXML
    private TextField language;

    @FXML
    private TextField timeZone;

    @FXML
    private TextField emailAddress;


    @FXML
    private TextField phoneNumber;


    @FXML
    void updateInfo(ActionEvent event){
        promptQuestion.setText("Fantastic! Go ahead and update your information.");
        fullName.setDisable(false);
        displayName.setDisable(false);
        sortableName.setDisable(false);
        pronoun.setDisable(false);
        language.setDisable(false);
        timeZone.setDisable(false);
        emailAddress.setDisable(false);
        phoneNumber.setDisable(false);


    }

    @FXML
    void dontUpdate(ActionEvent event){
        promptQuestion.setText("                       Have a great day!");
        fullName.setDisable(true);
        displayName.setDisable(true);
        sortableName.setDisable(true);
        pronoun.setDisable(true);
        language.setDisable(true);
        timeZone.setDisable(true);
        emailAddress.setDisable(true);
        phoneNumber.setDisable(true);

    }

}
