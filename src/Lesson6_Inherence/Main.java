package Lesson6_Inherence;

public class Main {
    public static void main(String[] args) {
        British lori = new British(5,"Dory", "Lori");
        British anotherLori =  new British(5,"Dory", "Lori");
        Scotish baxter = new Scotish(10, "Dayl", "Baxter");
        Scotish anotherBaxter = new Scotish(10, "Dayl", "Baxter");

        lori.sayMeow();
        baxter.sayMeow();
        System.out.println(lori.getName()+lori.getAge()+lori.getOwner());
        System.out.println();
        System.out.println(baxter.getName()+baxter.getAge()+baxter.getOwner());
// Метод toString принадлежит классу Object, который является суперклассом всех объектов.
        System.out.println(lori.toString());
        System.out.println(baxter.toString());

        System.out.println(lori.equals(anotherLori));
        System.out.println(baxter.equals(anotherBaxter));
    }
}
