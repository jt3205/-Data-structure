import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("aaa");
		stack.push("aaa");
		stack.push("aaa");
		stack.push("aaa");
		stack.push("aaa");
		stack.push("aaa");
		stack.add(3, "Áß°£»ğÀÔ");
		System.out.println(stack.toString());
		System.out.println(stack.size());
		System.out.println(stack.search("»ğÀÔ"));
		
	}

}
