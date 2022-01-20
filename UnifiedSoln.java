
import java.util.*;
import java.lang.*;

class UnifiedSoln
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		if(N>=1 && Q>=3) {
		    int arr[]=new int[N];
		    for(i=0;i<N;i++)
		        arr[i]=0;
		    for(i=0;i<Q;i++) {
		        int op=sc.nextInt();
		        int ind=sc.nextInt();
		        if(op==1) {
		            arr[ind]=2*arr[ind]+1;
		        }
		        else if(op==2) {
		            arr[ind]=(arr[ind])/2;
		        }
		        else if(op==3) {
		            int upind=sc.nextInt();
		            for(j=ind;j<upind;j++)
		                sum+=arr[j];
		        }
		    }
		}
		System.out.println(sum);
		sc.close();
	}
}
