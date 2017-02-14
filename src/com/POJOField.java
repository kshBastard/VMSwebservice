package com;

public class POJOField {





String fname,desicnation,salary;

public POJOField() {
	// TODO Auto-generated constructor stub
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getDesicnation() {
	return desicnation;
}

public void setDesicnation(String desicnation) {
	this.desicnation = desicnation;
}

public String getSalary() {
	return salary;
}

public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "POJOField [fname=" + fname + ", desicnation=" + desicnation
			+ ", salary=" + salary + "]";
}

}
