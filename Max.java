package java8;
//methodReference

public class Max {
	
	public int findMax(int[]ab) {
		int max=ab[0];
		for(int i=0;i<ab.length;i++) {
			if(ab[i]>max) {
				max=ab[i];
			}
		}
		
		return max;
	}
		
		
		public static int findMin(int[] bc) {
			int min=bc[0];
			for(int i=0;i<bc.length;i++) {
				if(bc[i]<min) {
					min=bc[i];
				}
			}
		
			
			return min;
		}
		
		
	}


