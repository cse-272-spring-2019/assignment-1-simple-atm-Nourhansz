package atm2;


import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class LoginForm2 {

    Scene scene;
    LoginAuthentication2 authentication;
    choosingOperation2 choosingOperation;
    Stage stage;
    public LoginForm2(Stage stage)
    {
        this.stage=stage;
    }

    public void prepareScene() {
        authentication = new LoginAuthentication2();
        Label cardNumber = new Label();
        cardNumber.setText("Card Number");
        TextField cardField = new TextField();
        Label password = new Label();
        password.setText("Passcode");
        PasswordField passField = new PasswordField();
        Label popup1=new Label();
        Button submit = new Button();
        submit.setText("Submit");
        submit.setOnAction((ActionEvent event) -> {
            String username = cardField.getText();
            String password1 = passField.getText();
            boolean validation = authentication.valid(username, password1);
            if (validation) {
                {System.out.println("You're logged in");
                stage.setScene(choosingOperation.getScene());
                }
                
            } else {
                System.out.println("Invalid Card Number or password");
                popup1.setText("Invalid Card Number or Passcode");
            }
        });
        GridPane grid = new GridPane();
        grid.add(cardNumber, 0, 0);
        grid.add(cardField, 1, 0);
        grid.add(password, 0, 1);
        grid.add(passField, 1, 1);
        grid.add(submit, 1, 2);
        grid.add(popup1, 1, 3);
        scene = new Scene(grid, 600, 400);
    }

    public Scene getScene() {
        return this.scene;
    }
    public void setchoosingOperation2(choosingOperation2 choosingOperation) {
        this.choosingOperation = choosingOperation;
    }

}
