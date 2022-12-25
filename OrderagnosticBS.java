public class OrderagnosticBS {
    public static void main(String[] args) {
       int arr[]={12,56,67,89,90,91,92,95,100,300};
       int target=12;
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
            int mid=low+(high-low)/2;
            if(arr[low]<arr[high])
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
            else{
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
        return -1;
    }
}
