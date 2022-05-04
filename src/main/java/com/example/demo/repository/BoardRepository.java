package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Board;

//T : 엔티티, ID : id 타입
public interface BoardRepository extends JpaRepository<Board, Integer> {
	
}
