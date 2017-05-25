import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.contains(",")){
			String[] strArray = str.split(",");
			if(Integer.parseInt(strArray[0]) == strArray[1].length()){
				int charNum = getCharNum(strArray[1]);
				System.out.println(charNum);
			}
		}
	}
	public static int getCharNum(String str){
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++){
			set.add(str.charAt(i));
		}
		return set.size();
	}
}
