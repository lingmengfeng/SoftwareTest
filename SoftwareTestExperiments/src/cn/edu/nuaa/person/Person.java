package cn.edu.nuaa.person;

public class Person implements Comparable<Person> {
	private String name;
	private String sex;
	private int age;
    private float height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "";//bug: "" should be changed to the parameter "name"
	}
	public String getSex() {
		return sex;
	}
	public void setSex(int flag) {
		if(flag==0)
			this.sex="male";
		else if(flag ==1)
			this.sex="female";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public int compareTo(Person o) {
		if(this.height>o.height)//bug: the operator ">" should be changed to  the operator "<".
			return -1;
		else if(this.height==o.height)
			return 0;
		else 
			return 1;
	}
}
