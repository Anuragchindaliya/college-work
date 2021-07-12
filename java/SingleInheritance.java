
class Shape {
    public void display() {
        System.out.println("Inside shape display");
    }
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Inside Rectangle area");
    }
}

public class SingleInheritance extends Rectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();
    }
}
