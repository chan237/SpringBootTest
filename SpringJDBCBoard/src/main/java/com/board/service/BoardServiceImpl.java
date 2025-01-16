package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO dao;
	
	public void register(Board board) throws Exception {
		dao.create(board);
	}

	@Override
	public List<Board> list() throws Exception {
		return dao.list();
	}

	@Override
	public Board read(int boardNo) throws Exception {
		return dao.read(boardNo); 
	}

	@Override
	public void remove(Integer boardNo) throws Exception {
		dao.delete(boardNo);		
	}
	
	
}
