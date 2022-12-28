public class CharacterBinary {
  public static void main(String[] args) {
char c[]={'a','b','c','d','e','f','g','h','i'};
char target='i';
int pos=search(c,target);
if(pos==-1)
System.out.println("The item was not found ");
else
System.out.println("The item was found in the position "+(pos+1));

  }  
  static int search(char c[],char target)
  {
    int start=0;
    int end=c.length-1;
    while(start<=end)
    {
      int mid=start+(end-start)/2;
      if(c[mid]==target)
      {
        return mid;
      }
      if(c[mid]<target)
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
