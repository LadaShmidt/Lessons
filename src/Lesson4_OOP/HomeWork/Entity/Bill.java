package Lesson4_OOP.HomeWork.Entity;

public class Bill {
    private int amount;

    public Bill(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
