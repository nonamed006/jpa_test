package com.example.demo.model;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private String writter;
	private String contents;
	private String reg_date;
	
}
