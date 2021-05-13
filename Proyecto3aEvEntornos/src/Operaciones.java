/**
 *
 * @author Eduardo Herencias Paco
 */
class Operaciones{
	public int[] rango (int a, int b){
		int[] nums = new int[b-a];
		for (int i=a; i<b; i++){
			nums[i]=i;
		}
		return nums;
	}

	public int sumRango(int a, int b){
		int sum = 0;
		for (int i=a; i<b; i++){
			sum+=i;
		}
		return sum;
	}

	public boolean isPar(int a){
		if(a%2==0){
			return true;
		}
		return false;
	}

	public int[] extraerPositivos(int []nums){
		
		int n=0;
		for (int i=0; i<nums.length; i++){
			if(nums[i]>0){
				n++;
			}
		}

		int []positivos = new int[n];
		int j=0;
		for (int i=0; i<nums.length; i++){
			if(nums[i]>0){
				positivos[j]=nums[i];
				j++;
			}
		}
		return positivos;
	}
}
