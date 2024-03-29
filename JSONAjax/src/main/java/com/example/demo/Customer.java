package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@SequenceGenerator(name="customer_sequence",sequenceName="sq_customer",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="customer_sequence")
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;

	protected Customer() {
	}

	protected Customer(Long id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
