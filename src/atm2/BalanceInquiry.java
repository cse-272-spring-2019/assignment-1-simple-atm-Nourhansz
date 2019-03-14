package atm2;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BalanceInquiry {

    Scene scene;
    choosingOperation2 choosingOperation;
    Stage stage;
    Codes codes=new Codes();
    int pointer;
    String[] history=new String[10];

    Deposit deposit;
    

    public BalanceInquiry(Stage stage) {
        this.stage = stage;
    }

    public void prepareScene() {
        Label popup1 = new Label();
       
        Button next=new Button();
        next.setText("Next");

        next.setOnAction((ActionEvent event) -> {
        
            popup1.setText("Your current balance is= "+codes.getCurrentBalance());
            pointer=choosingOperation.getPointer();
            history=choosingOperation.getHistory();
            history[pointer]="Balance inquiry "+codes.getCurrentBalance();
            pointer++;
            choosingOperation.setHistory(history);
            choosingOperation.setPointer(pointer);
        });
        Label balanceInquiry = new Label();
        balanceInquiry.setText("Balance Inquiry");
        Button back = new Button();
        back.setText("Back");
        back.setOnAction((ActionEvent event) -> {
            stage.setScene(choosingOperation.getScene());

        });
        GridPane grid = new GridPane();
        grid.add(balanceInquiry, 0, 0);
        grid.add(popup1, 0, 4);
        grid.add(back, 0, 2);
        grid.add(next, 0, 3);


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
