public class Twodarraysum {
   public static void main(String [] args)
   {
    int num[][]={{12,13,24,45},{23,34}};
    int ans=msum(num);
    System.out.println("The total sum is :"+ans);
    
   } 
 static int  msum(int num[][])
 {
   int max=0;
   for(int i=0;i<num.length;i++)
   {
      int sum=0;
      for(int j=0;j<num[i].length;j++)
      {
        sum=sum+num[i][j];
      }
      if(sum>max)
      max=sum;
   }
   return max;
 }
}
