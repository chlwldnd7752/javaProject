package test;

public class ArrayTest {
	
	
	
	public static void main(String[] args) {
		int[] nums={57, 5, 10, 7, 63, 9};
		sort(nums,1);	//��������
		sort(nums,2);	//��������
	}
	
	private static void sort(int[] nums, int orderby){
		
		
		if(orderby==1){
			for(int i=0; i<nums.length-1; i++){
				for(int j=i+1; j<nums.length; j++){
					if(nums[i]>nums[j]){
						int tmp=nums[i];
						nums[i]=nums[j];
						nums[j]=tmp;
					}
				}//j
			}//i
			
			for(int i=0; i<nums.length; i++){
				System.out.print(nums[i]+" ");
			}//��¹�
			
		}//if
				System.out.println();
		
			
			
			
			if(orderby==2){
				for(int i=0; i<nums.length-1; i++){
					for(int j=i+1; j<nums.length; j++){
						if(nums[i]<nums[j]){
							int tmp=nums[i];
							nums[i]=nums[j];
							nums[j]=tmp;
						}
					}//j
				}//i
				
				for(int i=0; i<nums.length; i++){
					System.out.print(nums[i]+" ");
				}//��¹�
				
			}//if
			
		}//sort()

	}
