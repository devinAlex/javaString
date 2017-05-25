import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Test21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			list.add(sc.nextInt());
		}
		StringBuilder sb = new StringBuilder();
		moreThanNum(list, sb);
		System.out.println(sb.toString());
		
	}
	public static void moreThanNum(List<Integer> list, StringBuilder sb){
		Set<Integer> set = new HashSet<Integer>(list);
		while(true){
			if(list.size() == new HashSet<Integer>(list).size()){
				for(Integer tep: list){
					sb.append(",").append(tep);
				}
				if(sb.length() > 0){
					sb.deleteCharAt(0);
				}
				return;
			}
			for(Integer temp : set){
				list.remove(temp);
			}
		}
	}
}
