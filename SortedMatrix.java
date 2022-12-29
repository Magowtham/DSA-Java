import java.util.Arrays;

public class SortedMatrix
{
    public static void main(String []args)
    {  
        int arr[][]={{10,20,30,40},{50,60,80,82},{90,100,102},{500,521,600}};
        int target=82;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int [][]matrix,int row,int cstart,int cend,int target)
    {
      while(cstart<=cend)
      {
        int mid=cstart+(cend-cstart)/2;
        if(matrix[row][mid]==target)
        {
            return new int []{row,mid};
        }
        if(matrix[row][mid]<target)
        {
            cstart=mid+1;
        }
        else{
            cend=mid-1;
        }
      }
      return  new int[]{-1,-1};
    }
    static int [] search(int [][]matrix,int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length;// be cautious matrix may be empty 
        if(rows==1)
        {
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        //run the loop till 2 rows are remaining
        while(rstart<(rend-1))//while this is true it will have morethan one rows
        {
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target)
            {
                return new int[]{mid,cmid};
            } 
            if(matrix[mid][cmid]<target)
            {
                rstart=mid;
            }
            else{
                rend=mid;
            }
        }
        System.out.println(rstart+" "+rend);
        //now we have two rows
        //check whaether the the target is in the  col of 2 rows
        if(matrix[rstart][cmid]==target)
        {
            return new int []{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target)
        {
            return new int []{rstart+1,cmid};
        }
        //search in first half 
        if(target<=matrix[rstart][cmid-1])
        {
          return binarySearch(matrix,rstart,0,cmid-1,target);
        }
         //search in second half 
         if(target>=matrix[rstart][cmid+1])
         {
            return binarySearch(matrix,rstart,cmid+1,cols-1,target); 
         }
         //search in third half 
         if(target<=matrix[rstart+1][cmid-1])
         {
            return binarySearch(matrix,rstart+1,0,cmid-1,target);
         }
         //search in fourth half 
        else
         {
            return binarySearch(matrix,rstart,cmid+1,cols-1,target);
         }

}
}