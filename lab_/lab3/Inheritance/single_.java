import java.util.*;

class PC{
    void typesOfPC(){
        System.out.println("There are two different personal computers named as Desktops and Laptops");
    }
}

class Desktop extends PC{
    void typeOfDesktop(){
        System.out.println("Desktop computer fall into three main families named as Tower, Compact and All-in-one");
    }
}

class TestInheritance{
    public static void main(String args[]){
        Desktop d1=new Desktop();

        d1.typeOfDesktop();
        d1.typesOfPC();
    }
}