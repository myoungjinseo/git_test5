package studentB;

public class Hello {
	String message = "안녕하세요";

<<<<<<< HEAD
	public String say() {
		return message;
		
=======
	public Hello() {
		this("안녕하세요");
	}
	public Hello(String message) {
		this.message = message;
	}
	public void say() {
		System.out.println(message);
>>>>>>> 8ae8811f24e29c04e843eec1ba2b514d8a08b94f
	}
}
