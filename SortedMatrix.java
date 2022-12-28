import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int a[][]={{10,20,30,40},{11,28,36,50},{13,30,39,52},{19,37,42,61}};
        int target=28;
        int pos[]=search(a,target);
        System.out.println(Arrays.toString(pos));


    }
    static int [] binarysearch(int [][] matrix,int row,int cStart,int cEnd,int target)
    {
        while(cStart<=cEnd)
        {
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target)
            {
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int []{-1,-1};
    }
    static int[] search(int [][]arr,int target)
    {
        int row=arr.length;
        int col=arr[0].length;
        if(row==1)
        {
            return binarysearch(arr,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStart<(rEnd-1))
        {
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid]<target)
            {
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }
        if(arr[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target)
        {
            return new int []{rStart+1,cMid};
        }
        if(target>=arr[rStart][cMid-1])
        {
            return binarysearch(arr,rStart,0,cMid-1,target);
        }
        if(target>=arr[rStart][cMid+1])
        {
            return binarysearch(arr,rStart,0,cMid+1,target);
        }
        if(target>=arr[rStart+1][cMid-1])
        {
            return binarysearch(arr,rStart+1,0,cMid-1,target);
        }
        else
        {
            return binarysearch(arr,rStart+1,0,cMid+1,target);
        }
    }
}
