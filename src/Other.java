
public class Other {
	public static int nthFib(int n){
		if(n<0)
			return -1;
		else if(n==0)
			return 0;
		else{
			int prev=1, result=1;
			for(int i=3; i<=n; i++){
				int temp = prev + result;
				prev = result;
				result = temp;
			}
			return result;
		}
			
	}
}
