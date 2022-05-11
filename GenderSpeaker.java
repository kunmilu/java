public class GenderSpeaker {
	public static void main(String[] args) {
		Man man = new Man();
		man.getGender();
		AbstractPerson.speak(man.getGender());
		Woman woman = new Woman();
		woman.getGender();
		AbstractPerson.speak(woman.getGender());
	}
}