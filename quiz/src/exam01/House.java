package exam01;

public class House {
	private Person[] persons;
	private int i=0;
	
	public House() {
		persons = new Person[10];
	}
	public void getIn(Person person) {
			persons[i] = person;
			i++;
	}
	public void print() {
		for (int i = 0; i < this.i; i++) {
			System.out.println("이름 : " + persons[i].getName());
			System.out.println("나이 : " + persons[i].getAge());
		}
	}
	public Person[] getPersons() {
		return persons;
	}
	
	
}
