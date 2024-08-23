import java.util.*;
class Girl{
	private String name;
	private int age;
	Girl(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	Girl(Girl x){
		this.copy(x);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void copy(Girl x) {
		this.setName(x.getName());
		this.setAge(x.getAge());
	}
}
public class Copy_Objects {

	public static void main(String[] args) {
		Girl g1 = new Girl ("rani", 21);
		//Girl g2 = new Girl ("ritu", 23);
		
		//g1.copy(g2);
		Girl g2 = new Girl(g1);
		
		System.out.println(g1);
		System.out.println(g1.getName());
		System.out.println(g1.getAge());
		System.out.println();
		System.out.println(g2);
		System.out.println(g2.getName());
		System.out.println(g2.getAge());


	}

}
