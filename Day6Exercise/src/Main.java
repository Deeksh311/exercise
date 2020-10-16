
public class Main {
	
	public static void main(String[] args) {
		
		gettime gettime = new gettime();
		
		gettime.start();
		
		gettime.setName("MyThread");
		
		System.out.println("Changed Thread name:" + gettime.getName());
	}
}
