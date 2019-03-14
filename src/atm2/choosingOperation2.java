package atm2;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class choosingOperation2 {

    Scene scene;
    LoginForm2 loginform;
    Deposit deposit;
    Withdraw withdraw;
    BalanceInquiry balanceInquiry;
    Stage stage;
    int pointer=0;
    String []history= new String[10];
    public choosingOperation2(Stage stage)
    {
        this.stage=stage;
    }
    

    public void prepareScene() {
        Label chooseOperation = new Label();
        chooseOperation.setText("Choose an operation");
        Label history1=new Label();
        history1.setText("");
        
        Button dep = new Button();
        dep.setText("1- Deposit");
       dep.setOnAction((ActionEvent event) -> {
                stage.setScene(deposit.getScene());
        });
        Button wd = new Button();
        wd.setText("2- Withdraw");
        wd.setOnAction((ActionEvent event) -> {
                stage.setScene(withdraw.getScene());
        });
        Button bi = new Button();
        bi.setText("3- Balance Inquiry");
        bi.setOnAction((ActionEvent event) -> {
                stage.setScene(balanceInquiry.getScene());
        });
        Button prev = new Button();
        prev.setText("4- Previous");
        prev.setOnAction((ActionEvent event) -> {
                pointer--;
                {
                    if(pointer!=-1)
                    {
                        if(history[pointer]!=null)
                        {
                            history1.setText(history[pointer]);
                        }
                    }
                    else 
                        history1.setText("You dont have history");

                }
        });
        Button next = new Button();
        next.setText("5- Next");
        next.setOnAction((ActionEvent event) -> {
                pointer++;
                {
                     if(history[pointer]!=null)
                        {
                            history1.setText(history[pointer]);
                        }
                     else 
                         history1.setText("You dont have history");
                    
                }
        });
        Button logout = new Button();
        logout.setText("Logout");
        logout.setOnAction((ActionEvent event) -> {
                stage.setScene(loginform.getScene());
        });
        GridPane grid = new GridPane();
        grid.add(chooseOperation, 0, 0);
        grid.add(dep, 0, 2);
        grid.add(wd, 0, 3);
        grid.add(bi, 0, 4);
        grid.add(prev, 0, 5);
        grid.add(next, 0, 6);
        grid.add(logout, 2, 8);
        grid.add(history1,0,7);
        

        scene = new Scene(grid, 600, 400);
        
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public void setLoginform(LoginForm2 loginform) {
        this.loginform = loginform;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }

    public void setBalanceInquiry(BalanceInquiry balanceInquiry) {
        this.balanceInquiry = balanceInquiry;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public void setHistory(String[] history) {
        this.history = history;
    }

    public int getPointer() {
        return pointer;
    }

    public String[] getHistory() {
        return history;
    }
    
    
}
