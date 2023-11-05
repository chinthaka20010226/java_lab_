/*
class A{
    void show_1(){
       System.out.println("in A show");
    }
}

class B extends A{
    void show_2(){
       System.out.println("in B show");
    }
}

class Demo{
    public static void main(String args[]){
         A a1=new A();

         a1.show_1();

         B b1=new B();

         b1.show_2();
         b1.show_1();
    }
}
*/


// =================================================================================================
// --> UpCasting

/*
class A{
    void show_1(){
       System.out.println("in A show");
    }
}

class B extends A{
    void show_2(){
       System.out.println("in B show");
    }
}

class Demo{
    public static void main(String args[]){
         A a1=new B();

         a1.show_2(); // a1 can't reach/find show_2(), because a1 type is 'A' 
         a1.show_1(); // it's okay
    }
}
*/



// ================================================================================================
// DownCasting 

class A{
    void show_1(){
       System.out.println("in A show");
    }
}

class B extends A{
    void show_2(){
       System.out.println("in B show");
    }
}

class Demo{
    public static void main(String args[]){
         A a1=new B();

         B b1=(B) a1;
         b1.show_2();
         b1.show_1();
    }
}




























