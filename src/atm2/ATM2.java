package atm2;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class ATM2 extends Application{
  
public static void main(String[] args) {
        launch(args);
            

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ATM MACHINE");
        
        LoginForm2 loginform=new LoginForm2(primaryStage);
        loginform.prepareScene();
        
        choosingOperation2 choosingOperation= new choosingOperation2(primaryStage);
        choosingOperation.prepareScene();
        
        Deposit deposit=new Deposit(primaryStage);
        deposit.prepareScene();
        
        Withdraw withdraw=new Withdraw(primaryStage);
        withdraw.prepareScene();
        
        BalanceInquiry balanceInquiry=new BalanceInquiry(primaryStage);
        balanceInquiry.prepareScene();
        
        loginform.setchoosingOperation2(choosingOperation);
        choosingOperation.setDeposit(deposit);
        choosingOperation.setWithdraw(withdraw);
        choosingOperation.setBalanceInquiry(balanceInquiry);
        balanceInquiry.setChoosingOperation(choosingOperation);
        choosingOperation.setLoginform(loginform);
        withdraw.setChoosingOperation(choosingOperation);
        deposit.setChoosingOperation(choosingOperation);

        
        primaryStage.setScene(loginform.getScene());
        primaryStage.show();
    } 
}
