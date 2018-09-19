package list;
//特有方法：
/*
 * ensureCapacity(int)
 * trimToSize()
 */
import java.util.ArrayList;

public class Demo6 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.ensureCapacity(100);
		int[] arr= new int[3];
		list.add(arr[0]=1);
		list.add(arr[1]=2);
		list.add(arr[2]=3);
		System.out.println(list);
		System.out.println(list.size());
		list.trimToSize();
		System.out.println(list.size());
	}
}
