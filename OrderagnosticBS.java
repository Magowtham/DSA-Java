public class OrderagnosticBS {
    public static void main(String[] args) {
       int arr[]={89,56,43,23,23,21,22,15,10,8,2};
       int target=89;
       int pos=search(arr,target);
       if(pos==-1)
       System.out.println("The item was not found");
       else
       System.out.println("The item was found in the position "+(pos+1));

    }
    static int search(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;//Finding the middle element
            if(arr[low]<arr[high])//checking the condition wheather array is asscending or not;
            {
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                    high=mid-1;
                }
                else{
                   low=mid+1;
                }
            }
            else{//else statement is will be executed if the array is in descending order
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                    low=mid+1;
                }
                else{
                 high=mid-1;
                }
            }
        }
        return -1;//returning -1 when the target was not found
    }
}
