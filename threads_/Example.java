import java.util.*;

// class Demo{
//     public static void main(String args[]){
//         SubjectThread subThread=new SubjectThread();
//         // Thread thread=new Thread(subThread);
//         subThread.run();

//         try{
//             Thread.sleep(5000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }

//         System.out.println("The main thread terminated");
//     }
// }

// class SubjectThread extends Thread{
//     Scanner input=new Scanner(System.in);

//     @Override
//     public void run(){
//         System.out.println("Thread is running...");
//         for(int i=0;i<5;i++){
//             System.out.println("input "+(i+1)+"-semester subject : ");
//             String subject=input.nextLine();
//             System.out.println((i+1)+"-semester subject : "+subject);

//             try{
//                 Thread.sleep(5000);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Thread is intrrupted");
//             }
//         }
    
//     }
// }






// class Demo{
//     public static void main(String args[]){
//         SubjectThread subThread=new SubjectThread();
//         // Thread thread=new Thread(subThread);
//         subThread.start();

//         try{
//             Thread.sleep(5000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }

//         subThread.interrupt();
//         System.out.println("The mian thread terminated");
//     }
// }

// class SubjectThread extends Thread{
//     Scanner input=new Scanner(System.in);

//     @Override
//     public void run(){
//         System.out.println("Thread is running...");
//         for(int i=0;i<5;i++){
//             System.out.println("input "+(i+1)+"-semester subject : ");
//             String subject=input.nextLine();
//             System.out.println((i+1)+"-semester subject : "+subject);

//             try{
//                 Thread.sleep(5000);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Thread is interrupted");
//                 // return;
//             }
//         }

//     }
// }







class Demo{
    public static void main(String args[]){
        SubjectThread sub1Thread=new SubjectThread();
        sub1Thread.start();
        SubjectThread sub2Thread=new SubjectThread();
        sub2Thread.start();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        sub1Thread.interrupt();
        System.out.println("The mian thread terminated");
    }
}

class SubjectThread extends Thread{
    Scanner input=new Scanner(System.in);

    @Override
    public void run(){
        System.out.println("Thread is running...");
        for(int i=0;i<5;i++){
            System.out.println("i : "+i);

            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println("Thread is interrupted");
                return;
            }
        }

    }
}




// ================================================================================================

