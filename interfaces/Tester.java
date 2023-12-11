// public class Tester{
//     public static void main(String args[]){
//         ThreadTester tTester=new ThreadTester();
//         Thread tOne=new Thread(tTester);
//         tOne.start();
//         // tOne.run();
//     }
// }

// class ThreadTester implements Runnable{
//     public void run(){
//         for(int j=0;j<50;j+=3){
//             System.out.println(j);
//             if(j*j-41 == 400){
//                 break;
//             }
//             try{
//                 Thread.sleep(5000);
//             } catch(InterruptedException e){
//                 throw new RuntimeException(e);
//             }
//         }
//     }
// }





// --------------------------------------------------------------------------------------------------




// class Main{
//     public static void main(String args[]){
//         Oranda oranda=new Oranda(500);
//         oranda.displayInfo();
//         Fish fish=new GoldFish();
//         fish.displayInfo();
//         System.out.println(Fish.kingdom);
//     }
// }

// interface Fish{
//     String kingdom = "Animalia";

//     public void displayInfo();
// }

// class GoldFish implements Fish{
//     GoldFish(){
//         System.out.println("Information regarding Gold Fish");
//     }

//     public void displayInfo(){
//         System.out.println("Max weight: 4.5 kg");
//         System.out.println("Max length: 23 inches");
//     }
// }

// class Oranda extends GoldFish{
//     private double weight;

//     Oranda(double weight){
//         System.out.println("Information regarding Oranda");
//         this.weight=weight;
//     }

//     public void displayInfo(){
//         System.out.println("The weight of the Oranda fish: "+weight);
//     }
// }




// ------------------------------------------------------------------------------------------


// class StringTester{
//     public static void main(String args[]){
//         StringBuilder a=new StringBuilder("Tensorflow");
//         a.reverse();
//         a.replace(0, 3, "GCN");
//         a.append("PyTorch");
//         a.delete(3,4);
//         System.out.println(a);
//     }
// }