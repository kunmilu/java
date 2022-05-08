public class GenderSpeaker {
	public static void main(String[] args) {
		Man man = new Man();
		man.getGender();
		man.speak(man.getGender());
		Woman woman = new Woman();
		woman.getGender();
		woman.speak(woman.getGender());
	}
}