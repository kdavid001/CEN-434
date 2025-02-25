public class for_practice {
    public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = new Car();
            Car car3 = new Car();

            car2.speed = 100;
            car2.color = "red";
            car2.brand = "toyota";
            car2.display();

            car2.greet_me();

    }
}

class Car{
    String color;
    int speed;
    String brand;

    void display(){
        System.out.println("color = "+color +" speed = " +speed +" brand = "+brand);
    }

    void greet_me(){
        System.out.println("Hello World");
    }
}