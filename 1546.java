import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		float sum=0,M=0;
		Scanner s = new Scanner(System.in);
		N=s.nextInt();
		float[] score=new float[N];
		
		for(int i=0;i<N;i++) {
			score[i]=s.nextInt();
			if(M<score[i]) {
				M=score[i];
			}
		}
		for(int i=0;i<N;i++) {
			score[i]=(score[i]/M)*100;
			sum+=score[i];
		}
		System.out.printf("%f",sum/N);
	}
}
