import java.io.*;
import java.util.*;
public class Q3
{
  public static void main(String [] args) throws IOException
  {
    int even;
    
    PrintWriter outputFile =  new PrintWriter("RandomNumbers.txt");
    PrintWriter outputFile1 =  new PrintWriter("EvenNumbers.txt");
    PrintWriter outputFile2 =  new PrintWriter("OddNumbers.txt");
    
    for (int i = 0; i <=5000; i++)
    {
      Random rnum = new Random();
      int randNum;
      randNum = rnum.nextInt();
      outputFile.println(randNum);
      even = (randNum % 2);
      
      if(even == 0)
      {
        outputFile1.println(randNum);
      } else
        outputFile2.println(randNum);  
    }  
    outputFile.close();
    outputFile1.close();
    outputFile2.close();
  }
}
