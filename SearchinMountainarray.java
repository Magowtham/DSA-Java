public class SearchinMountainarray {
    public static void main(String [] args)
    {
     int arr[]={12,23,45,67,89,123,168,23,12,10,5,6};
     int target=6;
     System.out.println(peaksearch(arr,target));
    }
    static int search(int arr[],int peaknum,int target)
    {
        int firsthalf=binarysearch(arr,target,0,peaknum-1);
        if(firsthalf!=-1)
        {
            return firsthalf;
        }
        int secondhalf=binarysearch(arr,target,peaknum+1,arr.length-1);
        if(secondhalf!=-1){
           return secondhalf;
        }
     return -1;
    }
    static int binarysearch(int arr[],int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[start]<arr[end])
            {
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                } 
            }
        }
        return -1;
    }
    static int peaksearch(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1])
            {
                return search(arr,mid,target);
            }
            else if(arr[mid-1]<arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return  -1;
    }
}
