import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String assignS = sc.next();
		String[] StrArray = str.split(",");
		List<Integer> list = new ArrayList<Integer>();
		for (String temp : StrArray) {
			if(temp.indexOf(assignS) !=-1){
				list.add(Integer.parseInt(temp));
			}
		}
		if(list.size() == 0){
			System.out.println("null");
		}else{
			Collections.sort(list);
			System.out.println(list.toString());
		}
		
	}
}
