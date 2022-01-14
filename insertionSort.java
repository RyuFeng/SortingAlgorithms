import java.io.*;

class Sort {
  
  //Sorting function
  private static int[] insertionSort(int[] arr)
  {
    int temp=0;   //temporary storage variable
    
    for(int i=1;i<arr.length;i++)   //Outer loop to loop through unsorted array, loop starts at 1 not 0
    {
      if(arr[i]<arr[i-1])   //Checking if current element is smaller than previous element
      {
        for(int j=i;j>0;j--)    //inner loop to find current elements position, looping backward from current position, stops at 1
        {
          if(arr[j]<arr[j-1])   //Checking if current element is smaller than previous element
          {
            temp=arr[j];        //Swapping elements
            arr[j]=arr[j-1];
            arr[j-1]=temp;
          }
          else    //if current element is larger than previous element no need to check further, break from inner loop
          break;
        }
      }
    }
    return arr;
  }
  
  //Driver function
  public static void main(String[]args)
  {
    int arr[]={3,4,7,6,8,2,9,1};
    insertionSort(arr);

    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
