package recursion;

public class Example1 {
	public static void main(String[] args) {
		printFun(3);
	}
	public static void printFun(int num) {
		if(num<1)
			return;
		else {
			System.out.print(num+" ");
			printFun(num-1);
			System.out.print(num+ " ");
		}
	}
}
