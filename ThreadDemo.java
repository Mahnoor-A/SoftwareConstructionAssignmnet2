/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threaddemo;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Mahnoor Amjad Lateef
 */
public class ThreadDemo implements Runnable{
    public static void main(String arg[]){
    ThreadDemo obj = new ThreadDemo();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
    try{
         FileWriter write = new FileWriter("newfile.doc");
         //write.open();
         write.write("i have added few lines into this document");
         write.close();
         System.out.println("successfully added in the file");
        }
     catch(Exception e)
       {
         System.out.println("error......");
         e.printStackTrace();
        }
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
 
}
  




