import java.util.*;
class Main {
	public static void main(String args[]) {
// 		ArrayList <Integer> alist=new ArrayList<>();
// 		alist.add(10);
// 		alist.add(11);
// 		alist.add(12);
// 		alist.add(13);
// 		alist.add(14);
// 		alist.add(15);
// 		alist.add(16);
// 		alist.add(0,50);
// 		System.out.println(alist);
// 		for(int i=0;i<alist.size();i++)
// 		System.out.println(alist.get(i));
// 		for (int x:alist)
// 		System.out.print(x + " ");
// 		alist.set(1,20);
// 		for (int x:alist)
// 		System.out.print(x + " ");
// 		alist.remove(0);
// 		Collections.sort(alist);
// 		System.out.println(alist);

        HashSet <String> hset=new HashSet<>();
        for(int i=0;i<10;i++)
        hset.add(i+"");
        hset.add(null);
        hset.add("9");
        HashSet <String> hset2=new HashSet();
        hset2=(HashSet)hset.clone();
        for(String x:hset2)
        System.out.print(x);
	}
}
