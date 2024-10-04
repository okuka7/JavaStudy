package access.b;

public class BankAcount {
    private int balance;

    public BankAcount() {
        balance =0;
    }
    //public 메서드 : deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }

    }

    public void withdra(int amount){
        if(isAmountValid(amount)&& balance - amount >=0){
            balance -=amount;
        }else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }
}
