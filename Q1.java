import java.util.*;
import java.io.*;

public class Q1
{
  public static void main(String [] args)throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    int num = 0;
    String line;
    
    System.out.println("Enter the file name.");
    String fileName = keyboard.nextLine();
    
    File file = new File(fileName + ".txt");
    
    Scanner inputFile = new Scanner(file);
    
    while(inputFile.hasNext())
    {
      line = inputFile.nextLine();
      if(num < 5)
      {  
        System.out.println(line);
        num+=1;
      }
    }
    inputFile.close();
  }
}