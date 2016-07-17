package coursera.rogers;

public class Primes {
	public static void main(String[] args) {
		int n =200;
		calPrime(n);
	}
	
	private static void calPrime(int n)
	{
		boolean isPrime[] = new boolean[n+1];
		//��ʼ�����е��������У���������Ĭ��Ϊ����������Ϊtrue
		for(int i=0; i<=n; i++){
			isPrime[i] = true;
		}
		
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				//���ݰ���ɸ��ȥ��i�ı���������
				for(int k=i*2; k<=n; k+=i){
					isPrime[k] = false;
				}
			}
			//���ݰ���ɸ����������ƽ������n��ʱ�����ѭ��
			if(i*i > n){
				System.out.println("========");
				System.out.println(i);
				System.out.println("========");
				break;
			}			
		}
		//����������������
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				System.out.print(i);
				System.out.print(" ");
			}
			//iÿ����100����һ��
			if(0 == (i%100)){
				System.out.println();
			}
		}
	}
}
