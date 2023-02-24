package Lesson4_OOP.HomeWork.Operation;
import Lesson4_OOP.HomeWork.Entity.Account;
public class TransferService {
    public void transferService (Account accountFrom, Account accountTo, int amount){
        if (accountFrom.getBill().getAmount()>=amount) {
            accountTo.getBill().setAmount(accountTo.getBill().getAmount()+amount);
            accountFrom.getBill().setAmount(accountFrom.getBill().getAmount()-amount);
            System.out.println("Клиент  " + accountFrom.getPerson().getName() + " " + accountFrom.getPerson().getSurName() + " переводит клиенту " + accountTo.getPerson().getName() + " " + accountTo.getPerson().getSurName() + " сумму " + amount);
            System.out.println("Счет клиента " + accountFrom.getPerson().getName() + " " + accountFrom.getPerson().getSurName() + " после перевода составляет " + accountFrom.getBill().getAmount());
            System.out.println("Счет клиента " + accountTo.getPerson().getName() + " " + accountTo.getPerson().getSurName() + " после перевода составляет " + accountTo.getBill().getAmount());
            System.out.println();
        }
    }
}
