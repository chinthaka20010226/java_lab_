// ---> Inner Class

// class OuterClass{
//     int x=10;

//     class InnerClass{
//         int y=11;
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         OuterClass outerclass=new OuterClass();
//         OuterClass.InnerClass innerclass=outerclass.new InnerClass();
//         System.out.println(outerclass.x+innerclass.y); 
//     }
// }




// ---> Static Inner Class


// class OuterClass{
//     int x=10;

//     static class InnerClass{
//         int y=11;
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         OuterClass outerclass=new OuterClass();
//         OuterClass.InnerClass innerclass=new OuterClass.InnerClass();
//         System.out.println(outerclass.x+innerclass.y); 
//     }
// }





// ---> Local Inner Class


// class Outer{
//     void myMethod(){
//         class Inner{
//             int x=10;
//         }
//         Inner inner=new Inner();
//         System.out.println(inner.x);
//     }
// }

// class Demo{
//     public static void main(String args[]){
//         Outer outer=new Outer();
//         outer.myMethod();
//     }
// }





// ---> Anonymous Inner Class


interface MyInterface{
    void myMethod();
}

class Dome{
    public static void main(String args[]){
        MyInterface myobject=new MyInterface() {
            public void myMethod(){
                System.out.println("this is a Anonymous Inner Class");
            }
        };

        myobject.myMethod();
    }
}