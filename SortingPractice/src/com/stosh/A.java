package com.stosh;
//public class A implements Comparable<String>
public class A implements Comparable<A>{
	public int id;
	public int rollNo;
	public String name;
	public String address;
	public String teacherName;
	
	
	
	public A(int id, int rollNo, String name, String address, String teacherName) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.teacherName = teacherName;
	}
	
	
	@Override
	public String toString() {
//		return "A [id=" + id + ", rollNo=" + rollNo + ", name=" + name
//				+ ", address=" + address + ", teacherName=" + teacherName + "]";
		return id +" " + rollNo + " "+ name + " " +address + " " + teacherName;	
		
	}
	//public String compareTo(A a1)
	public int compareTo(A a1){
		
		//return this.id - a1.id;
		//return this.rollNo - a1.rollNo;
		//return this.name.compareTo(a1.name);
		//return this.address.compareTo(a1.address);
		return this.teacherName.compareTo(a1.teacherName);
		
	}


	
	
//public int compareTo1(A a1){
//		
//		//return this.id - a1.id;
//		//return this.rollNo - a1.rollNo;
//		//return this.name.compareTo(a1.name);
//		//return this.address.compareTo(a1.address);
//		return this.teacherName.compareTo(a1.teacherName);
//		
//	}

}
