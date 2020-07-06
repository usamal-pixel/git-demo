package com.junitex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String address;

}
