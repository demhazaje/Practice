import java.util.*;
class Main {
	public static void main(String args[]) {
        int n=7;
        int a[]=new int[]{12,43,21,1,543,32,85};
        for(int i=0;i<n-1;i++) {
            int min_ind=i;
            for(int j=i+1;j<n;j++) 
                if(a[j]<a[min_ind])
                    min_ind=j;
            int tmp=a[min_ind];
            a[min_ind]=a[i];
            a[i]=tmp;
        }
        for(int i:a)
            System.out.print(i+" ");
	}
}
