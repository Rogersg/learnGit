package coursera.rogers;

public class Primes {
	public static void main(String[] args) {
		int n =200;
		calPrime(n);
	}
	
	private static void calPrime(int n)
	{
		boolean isPrime[] = new boolean[n+1];
		//初始化所有的数组序列，所有数字默认为素数，设置为true
		for(int i=0; i<=n; i++){
			isPrime[i] = true;
		}
		
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				//根据埃氏筛法去除i的倍数的数字
				for(int k=i*2; k<=n; k+=i){
					isPrime[k] = false;
				}
			}
			//根据埃氏筛法当素数的平方大于n的时候结束循环
			if(i*i > n){
				System.out.println("========");
				System.out.println(i);
				System.out.println("========");
				break;
			}			
		}
		//输出计算出来的素数
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				System.out.print(i);
				System.out.print(" ");
			}
			//i每增加100换行一次
			if(0 == (i%100)){
				System.out.println();
			}
		}
	}
}
