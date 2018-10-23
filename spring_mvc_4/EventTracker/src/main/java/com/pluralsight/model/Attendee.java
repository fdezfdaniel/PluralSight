package com.pluralsight.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.pluralsight.view.Phone;

public class Attendee {
	@Size(min = 2, max = 30)
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty @Phone
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
