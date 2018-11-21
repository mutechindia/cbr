package test;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
           //  ObjectInputStream name = new ObjectInputStream();
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  