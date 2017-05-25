import java.util.Scanner;

/**
 * 手机电池余量:用程序打印符号来表示当前手机的电量。
 * @author Administrator
 *用10行和10列来表示电池的电量，同时在外围加上边框，每一行表示10%电量，假设还有60%的电量，则显示如下：
+----------+
|----------|
|----------|
|----------|
|----------|
|++++++++++|
|++++++++++|
|++++++++++|
|++++++++++|
|++++++++++|
|++++++++++|
+----------+
 *输入：多组测试数据，第一行为测试数据组数N（N<10）,紧接着是N行，每行表示一个数，这个数值可能是：0,10,20,30,40,50,60,70,80,90,100
 *输出：每组输出一个电池的电量，每组数据之间用15个“=”隔开
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 10){
			for(int i = 0; i < a; i++){
				int energy = sc.nextInt();
				if(energy >= 0 && energy <= 100){
					battery(energy);
					if(i < a-1){
						System.out.println(" ===============");
					}
				}
			}
		}
	}
	public static void battery(int e){
		System.out.println("+----------+");
		for(int i = 0; i < 10 - e/10; i++){
			System.out.println("|----------|");
		}
		for(int i = 0; i < e/10; i++){
			System.out.println("|++++++++++|");
		}
		System.out.println("+----------+");
	}
}
