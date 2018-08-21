package cn.edu.nuaa.person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	public static  Person person  = new Person();
	 @Test
	    public void testNameSet(){	    //测试 setName()方法
	        String name="Xiao Ming";
	        person.setName(name);
	        String result=person.getName();
	        Assert.assertEquals(result,name);
	    }
	 @Test
	    public void testSexGet(){ //测试 getSex()方法
	       
	       int  flag=1;
	        person.setSex(flag);
	        String result=person.getSex();
	        Assert.assertEquals(result,"female");
	    }
	 @Test   
	    public void testAgeSet(){ //测试 getAge()方法
	        int age=17;
	        person.setAge(age);
	        int result =person.getAge();
	        Assert.assertEquals(result,age);
	    }
	 @Test
	    //测试 compareTo()方法
	    public void testCompareTo(){
	    	Person person2  = new Person();
	    	person.setHeight(174);
	    	person2.setHeight(176);
	        int result = person.compareTo(person2);
	        Assert.assertEquals(result, -1);
	    }
}
