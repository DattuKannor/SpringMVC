package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@Column(length = 80)
	private String pname;

	@Column(length = 200)
	private String address;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, mappedBy = "person")
	private Set<PhoneNumber> contactDetails;

	public Person() {
		super();
	}

	public Person(Integer pid, String pname, String address, Set<PhoneNumber> contactDetails) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.contactDetails = contactDetails;
	}

	public Person(String pname, String address, Set<PhoneNumber> contactDetails) {
		super();
		this.pname = pname;
		this.address = address;
		this.contactDetails = contactDetails;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<PhoneNumber> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Set<PhoneNumber> contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + "]";
	}

}
