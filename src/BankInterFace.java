public interface BankInterFace {

    double checkBalence();
    String addMoney(int amount);
    String withdrawMoney(int amount, String password);
    double calcualteIntrest(int years);
}
