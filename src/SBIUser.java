import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterFace {
    //attributes
    private String name;
    private String accountNo;
    private double balence;
    private String password;
    private  double rateOfIntrest;

    public SBIUser(String name, double balence, String password) {
        this.name = name;
        this.balence = balence;
        this.password = password;

        //bank is initializing
        this.rateOfIntrest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    @Override
    public double checkBalence() {
        return balence;
    }

    @Override
    public String addMoney(int amount) {
       balence=balence+amount;
       return "Your new balence is : "+balence;
}
    @Override
    public String withdrawMoney(int amount, String enteredPassword){
       if(Objects.equals(enteredPassword,password)){
           if(amount>balence){
               return "Insufficient balence";
           }
           else{
               balence=balence-amount;
               return "Lots of money";
           }
       }
       else{
           return "Wrong password !";
       }
    }

    @Override
    public double calcualteIntrest(int years) {
       return (balence*years*rateOfIntrest)/100;
    }
}
