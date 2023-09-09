
public class Function {
	public static void main(String[] args) {
		System.out.println(Fn1());
		System.out.println(Fn2("John"));
	}
	
	public static String Fn1() {
		return "Hey Dear";
	}
	
	public static String Fn2(String name) {
		return "Hey " + name;
	}
}
