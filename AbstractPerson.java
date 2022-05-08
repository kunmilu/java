public interface AbstractPerson {
	public String getGender();	
	
	public default void speak(String gender) {
		if (gender.equals("MAN")) {
			System.out.println("I'm a man");
		} else {
			System.out.println("I'm a woman");
		}
	}
}