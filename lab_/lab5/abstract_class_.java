// abstract class Shape{
//     abstract void draw();
// }

// class Rectangle extends Shape{
//     void draw(){
//         System.out.println("1");
//     }
// }

// class Circle extends Shape{
//     void draw(){
//         System.out.println("2");
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         Shape c1=new Circle();
//         c1.draw();
//     }
// }






abstract class Bike{
    Bike(){
        System.out.println("This is a Bike");
    }

    abstract void run();

    void changeGear(){
        System.out.println("This is a change of gear for Bike");
    }
}

class Honda extends Bike{
    Honda(){
        System.out.println("This is a Bike of Honda");
    }

    void run(){
        System.out.println("This is run of Hoanda");
    }
}

class Demo{
    public static void main(String args[]){
        Bike b1=new Honda();
        b1.run();
        b1.changeGear();
    }
}