public class Person_enum {
	
	enum Sex {MAN, WOMAN}
	
	private Sex sex;

	public Person(Sex sex) {
		this.sex = sex;
	}

	public void speak() {
		if (sex == Sex.MAN) {
			System.out.println("I'm a man");
		} else {
			System.out.println("I'm a woman");
		}	
	}
	
	public static void main(String[] args) {
		Person man = new Person(Sex.MAN);
		man.speak();
		Person woman = new Person(Sex.WOMAN);
		woman.speak();
	}		
}