package cn.edu.nuaa.person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	public static  Person person  = new Person();
	 @Test
	    public void testNameSet(){	    //���� setName()����
	        String name="Xiao Ming";
	        person.setName(name);
	        String result=person.getName();
	        Assert.assertEquals(result,name);
	    }
	 @Test
	    public void testSexGet(){ //���� getSex()����
	       
	       int  flag=1;
	        person.setSex(flag);
	        String result=person.getSex();
	        Assert.assertEquals(result,"female");
	    }
	 @Test   
	    public void testAgeSet(){ //���� getAge()����
	        int age=17;
	        person.setAge(age);
	        int result =person.getAge();
	        Assert.assertEquals(result,age);
	    }
	 @Test
	    //���� compareTo()����
	    public void testCompareTo(){
	    	Person person2  = new Person();
	    	person.setHeight(174);
	    	person2.setHeight(176);
	        int result = person.compareTo(person2);
	        Assert.assertEquals(result, -1);
	    }
}
