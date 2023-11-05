import java.util.*;

/*
class MinMaxGenerator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int num=0;

        for(int i=10;i>0;i--){
           System.out.print("input number : ");
           num=input.nextInt();

           if(num > max){
              max=num;
           }      
           if(num < min){
              min=num;
           }
        }
        System.out.println("minimum number : "+min+"\n"+"maximum number : "+max);
    }
}
*/




class MinMaxGenerator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        int[] numArr=new int[10];

        for(int i=10;i>0;i--){
           System.out.println("input no."+(11-i)+":");
           numArr[10-i]=input.nextInt();
        }

        for(int i:numArr){
           if(i > max) max=i;
           if(i < min) min=i;
        }

        System.out.println("minimum number : "+min+"\n"+"maximum number : "+max);
    }
}






















