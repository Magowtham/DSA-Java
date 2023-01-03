public class Mountainarray{
    public static void main(String [] args)
    {
        int arr[]={12,23,45,67,89,123,168,23,12,10,5,6};
        System.out.println(peaksearch(arr));

    }
    static int peaksearch(int []arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1])
            {
                return arr[mid];
            }
            else if(arr[mid-1]<arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }
}