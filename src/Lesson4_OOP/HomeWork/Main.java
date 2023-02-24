package Lesson4_OOP.HomeWork;
import Lesson4_OOP.HomeWork.Entity.*;
import Lesson4_OOP.HomeWork.Operation.*;
public class Main {
    public static void main(String[] args) {
        Person pit = new Person("Pit", "Climback", 1245987600);
        Bill billPit = new Bill(4000);
        Account pitAccount = new Account(pit,billPit);
 ///////////////////////////////////////////////////////////
        Person mary = new Person("Mary","Climback",1458967100);
        Bill billMary = new Bill(5000);
        Account maryAccount = new Account(mary,billMary);
 ///////////////////////////////////////////////////////////
        DepositService depositService = new DepositService();
        depositService.depositService(pitAccount, 450);
        PaymentService paymentService = new PaymentService();
        paymentService.paymentService(maryAccount, 1000);
        TransferService transferService = new TransferService();
        transferService.transferService(pitAccount, maryAccount, 2000);
    }
}
