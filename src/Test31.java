import java.util.Scanner;


public class Test31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		StringBuilder sb = new StringBuilder("const unsigned char buf[] = {");
		for(int i = 0; i < arrLength; i++){
			arr[i] = sc.nextInt();
			String binOx = Integer.toHexString(arr[i]);
			if(binOx.length() < 2){
				binOx = "0" + binOx;
			}
			sb.append("0x").append(binOx).append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("};");
		System.out.println(sb.toString());
	}
}
