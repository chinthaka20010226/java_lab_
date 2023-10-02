import java.util.*;

// ---> Compile time error ---> <identifier> expected

// class Test{
//     int a=100;
//     System.out.println();  

    
//     //void myMethod(){
//     //    System.out.println();
//     //}

//     //myMethod();
// }

// class Demo{
//     public static void main(String args[]){
//         Test t1=new Test();
//     }
// }



// ---> Compile time error ---> unreachable statement

// class Loop{
//     public static void main(String args[]){
//         for(int i=0;false;i++){
//             System.out.println("Java");
//         }
//     }
// }



// ---> Compile time error ---> variable num might not have been initialized

// class Demo{
//     public static void main(String args[]){
//         int num;

//         if(false){
//             num=10;
//         }
//         System.out.println(num);
//     }
// }





// class Basics{
//     private static int x = 1;
//     static void m(int i){
//         x++;
//         i++;
//     }

//     //public static void main(String args[]){
//     //    int d=3;
//     //    m(d);
//     //    System.out.println(x+" "+d);
//     //}
// }

// class Demo{
//     public static void main(String args[]){
//         int d=3;
//         Basics.m(d);
//         System.out.println(Basics.x+" "+d);
//     }
// }




// class Q5{
//     int a;
//     int b;
// }

// class Demo{
//     public static void main(String args[]){
//         Q5 a=new Q5();
//         a.a=10;
//         System.out.println(a.a+"");
//         System.out.println(a.b);
//     }
// }




// class Test{
//     int a;
//     int b;

//     Test(){
//         this.a=1;
//         this.b=2;
//     }

//     Test(int a){
//         this.a=a;
//     }

//     Test(int a,int b){
//         this.a=a;
//         this.b=b;
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         Test t1=new Test();
//         Test t2=new Test(5);
//         Test t3=new Test(7,9);
//     }
// }




// class Test{
//     int a;
//     int b;

//     Test(){
//         this(1);
//         System.out.println("Test()");
//     }

//     Test(int a){
//         this(a,a);
//         System.out.println("Test(int )");
//     }

//     Test(int a,int b){
//         this.a=a;
//         this.b=b;
//         System.out.println("Test(int ,int )");
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         Test t1=new Test();
//         Test t2=new Test(5);
//         Test t3=new Test(7,9);
//     }
// }




// class Test{
//     static int x;
// }

// class Demo{
//     public static void main(String args[]){
//         Test.x=11;
//     }
// }





// class Dress{
//     private double price;

//     void setPrice(double price){
//         this.price=price;
//     }

//     double getPrice(){
//         return this.price;
//     }

//     void showDetails(){
//         System.out.println("price of this dress is : "+this.getPrice());
//     }
// }

// class Shirt extends Dress{
//     private String size;

//     void setSize(String size){
//         this.size=size;
//     }

//     String getSize(){
//         return this.size;
//     }

//     void showDetails(){
//         System.out.println("This is a shirt and size is "+this.getSize());
//         super.showDetails();
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         Shirt s1=new Shirt();
//         s1.setPrice(1200);
//         s1.setSize("small");
//         //s1.showDetails();

//         Dress d1=new Dress();
//         d1.showDetails();
//     }
// }





// class Loop{
//     public static void main(String args[]){
//         int i=0;
//         boolean b=true;
//         for(i++;b;i++){
//             System.out.println(~i);
//             b^=true;
//         }
//     }
// }




class Pass{
    public static void main(String args[]){
        Integer a=012,b;

        for(b=0;b<=a;b++);
        System.out.print(b);
    }
}
