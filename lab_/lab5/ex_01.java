// class Demo{
//     public static void main(String args[]){
//         int x=0;
//         int y=5;
//         int num=0;

//         try{
//             num=y/x;
//         }
//         catch(Exception e){
//             System.out.println("can.t divide by zero");
//         }
//         System.out.println(num);
//     }
// }





// class Demo{
//     public static void main(String args[]){
//         int x=0;
//         int y=5;
//         int num=0;

//         int[] arr=new int[3];

//         String str=null;

//         try{
//             System.out.println(str.length());
//             System.out.println(arr[4]);
//             num=y/x;
//         }

//         // catch(Exception e){
//         //     System.out.println("something went wrong"+e);
//         // }

//         catch(ArithmeticException e){
//             System.out.println("can't divide by zero");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("array out bound exception");
//         }
//         catch(Exception e){
//             System.out.println("something went wrong"+e);
//         }
//         System.out.println(num);
//     }
// }






import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// class File_notFound_Demo{
//     public static void main(String args[]) throws FileNotFoundException{
//         File file=new File("D://myfile.txt");

//         FileReader fr=new FileReader(file);
//     }
// }



class File_notFound_Demo{
    public static void main(String args[]){
        try{
            File file=new File("D://myfile.txt");

            FileReader fr=new FileReader(file);

            BufferedReader reader=new BufferedReader(fr);
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("input output exception");
        }
        
    }
}





