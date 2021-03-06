import java.util.Random;
import java.util.Scanner;
public class LabOne {
   static int SIZE = 10;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random rn = new Random();
        int[] nums = new int[SIZE];
        for(int i=0;i<SIZE;i++){
            nums[i]=rn.nextInt(1000);
        }
        printNums(nums);
        insertionSort(nums);
        printNums(nums);

        System.out.println("Enter a number to search for: ");
        Scanner read = new Scanner(System.in);
        int key = read.nextInt();
        System.out.println(binarySearch(nums,key));
        read.close();
    }

    static void insertionSort(int[] nums) {
        int key;
            for(int i=1;i<SIZE;i++){
                key=nums[i];
                int j=i-1;
                while(j>=0 && key<nums[j]){
                    nums[j+1]=nums[j];
                    j--;
                    nums[j+1]=key;
                }
            }
    }

  static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        
        System.out.println();

    }
  static int binarySearch(int[] nums,int key){
      int pivot;
      int high = nums.length;
      int low=0;
      
      while( high>low){
          pivot=(high+low)/2;
          if(key==nums[pivot])
              return pivot;
          
          else if(key>nums[pivot]){
              low=pivot;
          }
          else{
              high=pivot;
          }
      }
      return -1;
  }

}

