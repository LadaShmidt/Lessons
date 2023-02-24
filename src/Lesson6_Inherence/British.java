package Lesson6_Inherence;


/*
 * Добавить класс родитель к своему классу достаточно просто,
 * это осуществляется с помощью ключевого слова exstends.
 */
public class British extends Cat {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
///////////////////////////////////////////////
    public British (int age, String owner, String name){
        super(age, owner);
        this.name = name;
    }
///////////////////////////////////////////////
// Override - аннотация означает, что метод переопределяется.
    @Override
    public String toString() {
// С помощьюключевого слова super мы обращаемся к родителям и можем использловать и переназначать этот метод.
        // return super.toString();
        return "Cat name " + name + " Age " + getAge() + " Owner " + getOwner();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() == obj.getClass()){
            British outsideObject = (British) obj;
            return name.equals(outsideObject.name)
                    && getAge() == outsideObject.getAge()
                    && getOwner().equals(outsideObject.getOwner());
        }
        return false;
    }

}
