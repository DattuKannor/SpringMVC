package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class MarriageSeeker implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String addrs;
	@Lob
	private byte[] photo;
	private LocalDateTime dob;
	@Lob
	private char[] biodata;
	private boolean indian;
	
	
	

	public MarriageSeeker() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public char[] getBiodata() {
		return biodata;
	}

	public void setBiodata(char[] biodata) {
		this.biodata = biodata;
	}

	public boolean isIndian() {
		return indian;
	}

	public void setIndian(boolean indian) {
		this.indian = indian;
	}

	public MarriageSeeker(Long id, String name, String addrs, byte[] photo, LocalDateTime dob, char[] biodata,
			boolean indian) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
		this.photo = photo;
		this.dob = dob;
		this.biodata = biodata;
		this.indian = indian;
	}

	public MarriageSeeker(String name, String addrs, byte[] photo, LocalDateTime dob, char[] biodata, boolean indian) {
		super();
		this.name = name;
		this.addrs = addrs;
		this.photo = photo;
		this.dob = dob;
		this.biodata = biodata;
		this.indian = indian;
	}

	@Override
	public String toString() {
		return "MarriageSeeker [id=" + id + ", name=" + name + ", addrs=" + addrs + ", photo=" + Arrays.toString(photo)
				+ ", dob=" + dob + ", biodata=" + Arrays.toString(biodata) + ", indian=" + indian + "]";
	}

}
