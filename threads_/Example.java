import java.util.*;

// ---> Ex - 01 


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







// class Demo{
//     public static void main(String args[]){
//         SubjectThread sub1Thread=new SubjectThread();
//         sub1Thread.threadName="T1";
//         sub1Thread.start();
//         SubjectThread sub2Thread=new SubjectThread();
//         sub2Thread.threadName="T2";
//         sub2Thread.start();

//         try{
//             Thread.sleep(5000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }

//         // sub1Thread.interrupt();
//         System.out.println("The mian thread terminated");
//     }
// }

// class SubjectThread extends Thread{
//     String threadName;

//     Scanner input=new Scanner(System.in);

//     @Override
//     public void run(){
//         System.out.println("Thread is running...");
//         for(int i=0;i<5;i++){
//             System.out.println(this.threadName+" i : "+i);

//             try{
//                 Thread.sleep(5000);
//             }
//             catch(InterruptedException e){
//                 System.out.println(this.threadName+" thread is interrupted");
//                 // return;
//             }
//         }

//     }
// }




// ================================================================================================
// ---> Runnable,


// class Demo{
//     public static void main(String args[]){
//         SubjectThread sub1Thread=new SubjectThread();
//         sub1Thread.threadName="T1";

//         Thread t1=new Thread(sub1Thread);

//         t1.start();

//         SubjectThread sub2Thread=new SubjectThread();
//         sub2Thread.threadName="T2";

//         Thread t2=new Thread(sub2Thread);

//         t2.start();

//         try{
//             Thread.sleep(5000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }

//         // sub1Thread.interrupt();
//         System.out.println("The mian thread terminated");
//     }
// }

// class SubjectThread implements Runnable{
//     String threadName;

//     Scanner input=new Scanner(System.in);

//     @Override
//     public void run(){
//         System.out.println("Thread is running...");
//         for(int i=0;i<5;i++){
//             System.out.println(this.threadName+" i : "+i);

//             try{
//                 Thread.sleep(5000);
//             }
//             catch(InterruptedException e){
//                 System.out.println(this.threadName+" thread is interrupted");
//                 // return;
//             }
//         }

//     }
// }




// ==================================================================================================
// ---> Ex - 02

// class Demo{
//     public static void main(String args[]){
//         MultiThread t1=new MultiThread("T1");
//         MultiThread t2=new MultiThread("T2");

//         t1.start();
//         t2.start();

//         try{
//             Thread.sleep(7000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }
//         t2.interrupt();
//     }
// }

// class MultiThread extends Thread{
//     String threadName;

//     MultiThread(String threadName){
//         this.threadName=threadName;
//         System.out.println("Creating thread = "+this.threadName);
//     }

//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println(this.threadName);

//             try{
//                 Thread.sleep(3000);
//             }
//             catch(Exception e){
//                 System.out.println(this.threadName+" is interrupted");
//                 return;
//             }
//         }
//         System.out.println(this.threadName+" is terminated");
//     }
// }






// class Demo{
//     public static void main(String args[]){
//         MultiThread t1=new MultiThread("T1");
//         MultiThread t2=new MultiThread("T2");

//         t1.t=t2;   // NullPointException

//         t1.start();
//         t2.start();

//         try{
//             Thread.sleep(7000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }
//         // t2.interrupt();
//     }
// }

// class MultiThread extends Thread{
//     String threadName;
//     MultiThread t;

//     MultiThread(String threadName){
//         this.threadName=threadName;
//         System.out.println("Creating thread = "+this.threadName);
//     }

//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             if(i==3){
//                 if(t!=null){
//                     t.interrupt();
//                 }
//             }
//             System.out.println(this.threadName+" i :"+i);

//             try{
//                 Thread.sleep(3000);
//             }
//             catch(Exception e){
//                 System.out.println(this.threadName+" is interrupted");
//                 return;
//             }
//         }
//         System.out.println(this.threadName+" is terminated");
//     }
// }






// class Demo{
//     public static void main(String args[]){
//         MultiThread m1=new MultiThread("T1");
//         MultiThread m2=new MultiThread("T2");

//         Thread t1=new Thread(m1);
//         Thread t2=new Thread(m2);

//         m1.t=t2;   // NullPointException

//         t1.start();
//         t2.start();

//         try{
//             Thread.sleep(7000);
//         }
//         catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }
//         t2.interrupt();
//     }
// }

// class MultiThread implements Runnable{
//     String threadName;
//     Thread t;

//     MultiThread(String threadName){
//         this.threadName=threadName;
//         System.out.println("Creating thread = "+this.threadName);
//     }

//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             if(i==3){
//                 if(t!=null){
//                     // t.interrupt();
//                 }
//             }
//             System.out.println(this.threadName+" i :"+i);

//             try{
//                 Thread.sleep(3000);
//             }
//             catch(Exception e){
//                 System.out.println(this.threadName+" is interrupted");
//                 return;
//             }
//         }
//         System.out.println(this.threadName+" is terminated");
//     }
// }








// ====================================================================================================
// ---> Thread Synchronization...

class Demo{
    public static void main(String args[]){
        Count c=new Count();

        ThreadDemo1 t1=new ThreadDemo1(c);
        ThreadDemo2 t2=new ThreadDemo2(c);

        t1.start();
        t2.start();
    }
}

class Count{
    synchronized void printCount(int n){
        for(int i=0;i<5;i++){
            System.out.println("Count alue "+(i * n));
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("Thread is unterrupted");
            }
        }
        System.out.println("Thread is terminated");
    }
}

class ThreadDemo1 extends Thread{
    Count c;

    ThreadDemo1(Count c){
        this.c=c;
    }

    @Override
    public void run(){
        c.printCount(100);
    }
}

class ThreadDemo2 extends Thread{
    Count c;

    ThreadDemo2(Count c){
        this.c=c;
    }

    @Override
    public void run(){
        c.printCount(10);
    }
}
