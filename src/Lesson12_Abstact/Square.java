package Lesson12_Abstact;

public abstract   class Square extends Figure {
    @Override
    public void area() {
        System.out.println("it's area of circle");
    }

    @Override
    public void perimeter() {
        System.out.println("it's area of perimeter");
    }
}

