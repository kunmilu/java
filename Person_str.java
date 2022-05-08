public class Person_str {
	
	private String sex;
	
	public Person(String sex) {
		this.sex = sex;
	}

	public void speak() {
		if (sex.equals("man")) {
			System.out.println("I'm a man");
		} else {
			System.out.println("I'm a woman");
		}
		
		//System.out.println("I'm a " + sex);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("man");
		p1.speak();
		Person p2 = new Person("woman");
		p2.speak();
		

	}		
}