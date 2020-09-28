package ramda.basic;

public class Person {
	public void greating(Say01 say) {
		say.talking();
	}
	public void greation(Say02 say) {
		say.talking("byebye~");
	}
	public Person greating(Say03 say) {
		String finish = say.talking();
		Person p = new Person();
		return p;
	}
}
