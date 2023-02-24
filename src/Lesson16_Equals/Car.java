package Lesson16_Equals;

public class Car {
    String color;
    String engine;
    Car(String color, String engine){
        this.color= color;
        this.engine = engine;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car) {
            Car car = (Car) obj;
            return (color.equals(car.color) && engine.equals(car.engine));
        }else {
            return false;
        }
    }

}