public class BinarySearch{
    public static void main(String[] args)
    {
        int arr[]={12,45,56,78,67,89};
        int target=56;
        int pos=Binary(arr,target);
        if(pos==-1)
            System.out.println("The target was not found");
        else
        System.out.println("The target was found in the position :"+(pos+1));
        
      
    }
    static int Binary(int arr[],int target)
    {
    //the toatal comparisions is log(arr.length)
    //N/2^k=1
    //Genearal formula for tatal comaprissions is n=log(arr.length)/log(2)
    int low =0;//initializing the low value of the array index number
    int high=arr.length-1;//intializing the highest value of the array index numaber
    //to find the mid value in the array size is 
    //mid =(low+high)/2
    //but the better formula to find the mid value and store the value in the integer datatype
    //int is num=low+(high-low)/2
    while(low<=high)
    {
    int mid=low+(high-low)/2;
    if(arr[mid]==target)
    {
        return mid;//returning the mid when the target is founded
    }
    else if(arr[mid]<target)
    {
        low =mid+1;//changing the low value to one step forward then mid 
    }
    else{
        high=mid-1;//chaging the high value to one step backword the mid 
    }
    }

      return -1;//returning the -1 if target was not found 
    }
}