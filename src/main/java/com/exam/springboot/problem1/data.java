package com.exam.springboot.problem1;

public class data {
	
	
private int id;
private String name;
private int age;
private String problem;
private String address;

@Override
public String toString() {
	return "data [id=" + id + ", name=" + name + ", age=" + age + ", problem=" + problem + ", address=" + address + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getProblem() {
	return problem;
}
public void setProblem(String problem) {
	this.problem = problem;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
