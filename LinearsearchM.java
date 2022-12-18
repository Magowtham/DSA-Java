import java.util.Scanner;

public class LinearsearchM{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[][]={
        {1,2,3},
        {2,1,4},
        {3,34,54,3,3}
      };
      int key=54;
      if(searchl(a,key)==true)
      {
        System.out.println("item found");
      }
      else{
        System.out.println("item not found");
      }
    

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