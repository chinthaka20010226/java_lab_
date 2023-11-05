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

class TestInheritance{
    public static void main(String args[]){
        Desktop d1=new Desktop();
        Laptop l1=new Laptop();

        d1.typesOfDesktop();
        d1.typesOfPC();

        l1.typesOfLaptop();
        l1.typesOfPC();
    }
}