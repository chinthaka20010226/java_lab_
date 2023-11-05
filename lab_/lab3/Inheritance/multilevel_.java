import java.util.*;

class PC{
    void typesOfPC(){
        System.out.println("There are two different personal computer named as Desktop and Laptops");
    }
}

class Desktop extends PC{
    void typesOfDesktop(){
        System.out.println("Desktop computer fall into three main families named as Tower, Compact and All-in-one");
    }
}

class Laptop extends PC{
    void typesOfLaptop(){
        System.out.println("There are different Laptops named as Notebook, Macbook, Ultrabook, Tablet etc");
    }
}

class Tablet extends Laptop{
    void typesOfTablet(){
        System.out.println("There are different tablets named as Convertible tablets, hybrid tablets and rugged tablets");
    }
}

class TestInheritance{
    public static void main(String args[]){
        Tablet t1=new Tablet();

        t1.typesOfTablet();
        t1.typesOfLaptop();
        t1.typesOfPC();
    }
}