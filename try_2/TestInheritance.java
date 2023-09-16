class Pc{
    void typeOfPc(){
        System.out.println("There are two different personal computers and named as desktop and laptop");
    }
}

class Desktop extends Pc{
    void typeOfDesktop(){
        System.out.println("Desktop computer fall into 3 main families named as Tower, Compact and All in one");
    }
}

class Laptop extends Pc{
    void typeOfLaptop(){
        System.out.println("There are diffrent Laptop named as Notebook, Macbook , Ultrabook, Tablet etc.");
    }
}

public class TestInheritance{
    public static void main(String args[]){
        //create object for Desktop,
        Desktop desktop=new Desktop();
        //create object for Laptop,
        Laptop laptop=new Laptop();

        desktop.typeOfDesktop();
        desktop.typeOfPc();
        laptop.typeOfLaptop();
        laptop.typeOfPc();

    }
}
