import java.util.Random;
public class LabTwo{
	public static void main(String[] args){
		int[] nums = new int[13];
		Random rn = new Random();
		for(int i=0;i<13;i++){
			nums[i]=rn.nextInt(12);
		}
		printnums(nums);
		mergesort(nums);
		printnums(nums);	
	}
	static void mergesort(int[] nums){
		int p=0;
		int r=nums.length;
		mergesort(nums,p,r);
	}
	static void mergesort(int[] nums,int p,int r){
		int q;
		if(p<r){
			q=(p+r)/2;
			mergesort(nums,p,q);
			mergesort(nums,q+1,r);
			merge(nums,p,q,r);
		}
	}
	static void merge(int[] nums,int p, int q, int r){
		int n_1=q-p+1;
		int n_2=r-q;
		int[] list1 = new int[n_1 + 1];
		int[] list2 = new int[n_2 + 1];

		for(int i=0;i<n_1;i++)
			list1[i] = nums[p+i];
		for(int i=0;i<n_2;i++)
			list2[i] = nums[q+1+i];

		int i=0;
		int j=0;

		for(int k=p;k<r;k++){
			if(list1[i] <= list2[j]){
				nums[k]= list1[i];
				i++;
			}
			else{
				nums[k]=list2[j];
				j++;
			}
		}
		
	}
	static void printnums(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+ " ");
		}
		System.out.println("");
	}

}
