package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String sname;
	private String scourse;

	public int getSno() {
		return sno;
	}

	public Student() {
		super();
	}

	public Student(int sno, String sname, String scourse) {
		this.sno = sno;
		this.sname = sname;
		this.scourse = scourse;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", scourse=" + scourse + "]";
	}

}
