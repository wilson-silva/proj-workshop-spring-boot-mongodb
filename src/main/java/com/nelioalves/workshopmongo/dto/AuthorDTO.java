package com.nelioalves.workshopmongo.dto;

import java.io.Serializable;

import com.nelioalves.workshopmongo.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;

	public AuthorDTO() {

	}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

}
