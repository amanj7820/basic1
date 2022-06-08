import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class Group1_ByteStream {
    
    public static void main(String[] args)  {
        
        //First use output stream to create a file
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();

       try {
            
            OutputStream obj = new FileOutputStream("New_File1");

            byte[] arr = str.getBytes();

            obj.write(arr);

            System.out.println("Writting into file successfully done ");
            obj.close();
       } catch (Exception e) 
       {
            e.printStackTrace();
       }
        sc.close();
       //Then use inputStream to read file
       byte[] arr = new byte[100];
        try {
            InputStream ob = new FileInputStream("New_File1");

            System.out.println("TotalBytes in file : " + ob.available());
            ob.read(arr);
            System.out.println("Reading files : ");

           String data = new String(arr);
           System.out.println(data);

           ob.close();


        } catch (Exception e) {
          
            e.printStackTrace();
        } 
            
        
    }
}
