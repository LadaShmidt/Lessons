package Lesson6_Inherence;
public class Scotish extends Cat {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
////////////////////////////////////////////////
    public Scotish (int age, String owner, String name){
        super(age, owner);
        this.name = name;
    }
////////////////////////////////////////////////
    @Override
    public String toString() {
        return  "Cat name " + name + " Age " + getAge() + " Owner " + getOwner();
    }
}
