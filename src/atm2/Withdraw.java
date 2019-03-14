package atm2;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Scanner;

public class Withdraw {

    Scene scene;
    choosingOperation2 choosingOperation;
    Stage stage;
    static Scanner scan = new Scanner(System.in);
    Codes codes = new Codes();
    int pointer;
    String[] history = new String[10];

    public Withdraw(Stage stage) {
        this.stage = stage;
    }

    public void prepareScene() {
        Label withdraw = new Label();
        withdraw.setText("Enter the amount you want to Withdraw");
        TextField withdrawAmount = new TextField();
        Button next = new Button();
        Label popup1 = new Label();
        Label popup2 = new Label();
        next.setText("Next");
        next.setOnAction((ActionEvent event) -> {
                 String b = "";
            String amount = withdrawAmount.getText();
            double amount1 = Double.valueOf(amount);
            double bal = Codes.withdraw(amount1);
            boolean valid = Codes.validation(amount1);
            if (valid) {
           
            pointer = choosingOperation.getPointer();
            history = choosingOperation.getHistory();
            Codes.setBalance(bal);
            history[pointer] = "You Withdrew" + amount1;
            pointer++;
            choosingOperation.setHistory(history);
            choosingOperation.setPointer(pointer);
            choosingOperation.getHistory();

            popup1.setText("Your new Balance is " + bal);
                popup2.setText("Your operation is successful");
            } else {
                popup2.setText("Sorry cannot do this operation");
            }

        });
        Button back = new Button();
        back.setText("Back");
        back.setOnAction((ActionEvent event) -> {
            stage.setScene(choosingOperation.getScene());

        });
        GridPane grid = new GridPane();
        grid.add(withdraw, 0, 0);
        grid.add(withdrawAmount, 0, 2);
        grid.add(next, 0, 3);
        grid.add(back, 0, 4);
        grid.add(popup1, 0, 6);
        grid.add(popup2, 0, 5);

        scene = new Scene(grid, 600, 400);
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public void setChoosingOperation(choosingOperation2 choosingOperation) {
        this.choosingOperation = choosingOperation;
    }

}
