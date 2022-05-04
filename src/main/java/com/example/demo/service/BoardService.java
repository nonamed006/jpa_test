package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Board;
import com.example.demo.repository.BoardRepository;

@Service
public class BoardService {
	// 레파지토리 인터페이스 사용위해서 의존성 주입
	private BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository  = boardRepository;
	}
	
	// insert
	//save메소드는 id가 null이면 insert, 값이 있으면 update
	public Board insert(Board board) {
		return this.boardRepository.save(board);
	}
	
	// select
	public List<Board> all(){
		return this.boardRepository.findAll();
	}
}
