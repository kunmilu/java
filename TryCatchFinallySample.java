public class TryCatchFinallySample {
	public static void main(String[] args) {
		try {
			System.out.println("try");
            long num = Integer.parseInt(args[0]);  
		} catch (Exception e){
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}  