public class Binarysearch2D {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        int arr[][]={{12,13,14,15},{24,25,26,30},{32,33,36,38},{42,43,44,45,47}};
        int target=47;
        int pos[]=search(arr,target);
        if(pos[0]==-1)
        System.out.println("The item was not found");
        else{
        System.out.print("The item was found in the position: "+pos[0]);
        System.out.println(","+pos[1]);
        }
        final long duration = System.nanoTime() - startTime;
        System.out.println("The time taken by the programm is "+((duration)/1000)+"μs");

    }
static int[] search(int a[][],int target)
{
    int row=0;
    int col=a.length-1;
    while(row<a.length&&col>=0)
    {
        if(a[row][col]==target)
        {
        int pos[]={row+1,col+1}; 
        return pos;
        }
        else if(a[row][col]<target)
        {
          row++;
        }
        else{
            col--;
        }

    }
    int pos[]={-1};
    return pos;
}
}
