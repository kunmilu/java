public interface AbstractPerson {
	public String getGender();

	static void speak(String gender) {
		if (gender.equals("MAN")) {
			System.out.println("I'm a man");
		} else {
			System.out.println("I'm a woman");
		}
	}
}