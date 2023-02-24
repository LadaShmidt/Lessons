package Lesson4_OOP.HomeWork.Operation;
import Lesson4_OOP.HomeWork.Entity.Account;
public class DepositService {
    public void depositService (Account account, int amount){
       account.getBill().setAmount(account.getBill().getAmount()+amount);
       System.out.println("Счет клиента " + account.getPerson().getName() + " " + account.getPerson().getSurName() + " после пополнения составляет " + account.getBill().getAmount());
       System.out.println();
    }

}
