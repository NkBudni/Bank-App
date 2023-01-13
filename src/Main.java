import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password, balence to create an account");

        //create user
        String name=sc.next();
        String password= sc.next();
        double balence=sc.nextDouble();
        SBIUser user= new SBIUser(name,balence,password);
        System.out.println("Your acount No : "+ user.getAccountNo());
        // add amount
        String message=user.addMoney(100000);
        System.out.println(message);

        //withdrow money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //rate of intrest
        System.out.println(user.calcualteIntrest(10));
    }
}