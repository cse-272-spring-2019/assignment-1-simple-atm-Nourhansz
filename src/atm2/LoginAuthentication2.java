package atm2;
public class LoginAuthentication2 {
    public boolean valid(String cardNumber,String passcode)
    {
        final String cn="123456789";
        final String pc="1234";
        if(cn.equals(cardNumber)&&pc.equals(passcode))
        return true;
        else return false;
    }
}
