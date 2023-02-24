package Lesson4_OOP;
/*
 * Объекто ориентированное программирование - методология программирования,
 * основанная на представлении программы в виде совокупности взаимодействующих объектов,
 * каждый из которых является экземпляром определённого класса,
 * а классы образуют иерархию наследования.
 */
public class Main {
    /* Модификаторы доступа
     * private - доступ только внутри класса.
     * package - доступ внутри класса и в классах находящихся в том же пакете(при наследовании внутри пакета).
     * protected - доступ внутри класса, в классах в том же пакете и при наследовании.
     * public - доступ в любом месте.
     */
    // При создании класса, поля принято объявлять с модификатором private //
    public static void main(String[] args) {
        Cat loriCat = new Cat();
        loriCat.setName("Lori");
        loriCat.setWeight(4);
        Cat baxterCat = new Cat();
        baxterCat.setName("Baxter");
        baxterCat.setWeight(10);

        FightClub fightClub = new FightClub();
        String catWinnerName = fightClub.fight(loriCat, baxterCat);
        System.out.println("Winner: "+catWinnerName);

        loriCat.setWeight(12);
        System.out.println("New Winner: "+ fightClub.fight(loriCat, baxterCat));
    }
}
