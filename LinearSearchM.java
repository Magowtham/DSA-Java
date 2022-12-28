import java.util.Scanner;

public class LinearsearchM{
    public static void main(String[] args) 
    {
      final long startTime = System.nanoTime();
      int a[][]={{12,13,14,15},{24,25,26,30},{32,33,36,38},{42,43,44,45,47}};
      int key=47;
      if(searchl(a,key)==true)
      {
        System.out.println("item found");
      }
      else{
        System.out.println("item not found");
      }
    
      final long duration = System.nanoTime() - startTime;
      System.out.println("The time taken by the programm is "+((duration)/1000)+"μs");
    }
    public static boolean searchl(int a[][],int key)
    {
     for(int b[]:a)
     {
       for(int x:b)
       {
        if(x==key)
        {
            return true;
        }
       }
     }
     return false;
    }

}