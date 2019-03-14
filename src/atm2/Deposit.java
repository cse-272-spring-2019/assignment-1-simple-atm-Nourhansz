package atm2;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deposit {

    Scene scene;
    choosingOperation2 choosingOperation;
    Stage stage;
    Codes codes=new Codes();
    int pointer;
    String[] history=new String[10];

    public Deposit(Stage stage) {
        this.stage = stage;
    }

    public void prepareScene() {
        Label deposit = new Label();
        deposit.setText("Enter the amount you want to deposit");
        TextField depositAmount = new TextField();
        Label popup1=new Label();
        Button next = new Button();
        next.setText("Next");
        next.setOnAction((ActionEvent event) -> {
            String b="";
            String amount= depositAmount.getText();
            double amount1=Double.valueOf(amount);
            double bal=Codes.deposit(amount1);
            pointer=choosingOperation.getPointer();
            history=choosingOperation.getHistory();
            Codes.setBalance(bal);
            history[pointer]="You Deposited"+amount1;
            pointer++;
            choosingOperation.setHistory(history);
            choosingOperation.setPointer(pointer);
            choosingOperation.getHistory();
      
            popup1.setText("Your new Balance is "+bal);

        });
        Button back = new Button();
        back.setText("Back");
        back.setOnAction((ActionEvent event) -> {
            stage.setScene(choosingOperation.getScene());

        });
        Button submit=new Button();
        
        
        GridPane grid = new GridPane();
        grid.add(deposit, 0, 0);
        grid.add(depositAmount, 0, 2);
        grid.add(next, 0, 3);
        grid.add(back,0,4);
        grid.add(popup1, 0, 5);
       
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
