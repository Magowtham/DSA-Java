public class even_odd_digits{
    public static void main(String [] args)
    {
    int num[]={10,23,2345,45,3,56,47};
    int total[]=digitcount(num);
    System.out.println("The even digit count is :"+total[0]);
    System.out.println("The odd digit count is :"+total[1]);
    }
   static int[] digitcount(int num[])
   {
    int count=0;
    int evencount=0;
    int oddcount=0;
    for(int i=0;i<num.length;i++)
    {
      while(num[i]>0)
      {
        count++;
        num[i]=num[i]/10;
      }
      boolean ans=checkdigit(count);
      if(ans)
      evencount=evencount+1;
      else
      oddcount=oddcount+1;
      count=0;
    }
     int total[]={evencount,oddcount};
     return total;
   }
    static boolean checkdigit(int num)
    {
        if(num%2==0)
        return true;
        return false;
    }
}