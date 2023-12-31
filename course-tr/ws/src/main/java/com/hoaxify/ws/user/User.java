package com.hoaxify.ws.user;


import lombok.Data;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.ws.shared.Views;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
@Data
public class User {
	
	@Id
	@GeneratedValue
	private long id;

	@NotNull(message = "{hoaxify.constraint.username.NotNull.message}")
	@Size(min = 4, max = 255)
	@UniqueUsername
	@JsonView(Views.Base.class)
	private String username;
	
	@NotNull
	@Size(min = 4, max = 255)
	@JsonView(Views.Base.class)
	private String displayName;
	
	@NotNull
	@Size(min = 8, max = 255)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{hoaxify.constraint.password.Pattern.message}")
	@JsonView(Views.Sensitive.class)
	private String password;
	
	@JsonView(Views.Base.class)
	private String image;
	

}
