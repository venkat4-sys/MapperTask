package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="user_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
	
	@Id
	private Integer id;
	
	private String userName;
	
	private String email;

}
