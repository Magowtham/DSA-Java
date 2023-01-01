public class Ceiling {
   public static void main(String[] args) {
    int arr[]={2,3,5,9,14,16};
    int target=1;
    System.out.println(bigelementsearch(arr, target));
   
   } 
   static int bigelementsearch(int arr[],int target)
   {
    int start=0;
    int end=arr.length-1;
    int big=target;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
        return arr[mid];
        }
        else if(arr[mid]>target)
        {
          big=arr[mid];
          end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return (big==target)?-1:big;
   }
}
