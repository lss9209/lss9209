package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList() {
		return boardMapper.selectBoardList();
	}
	
	public void writeReply(BoardVO boardVO) {
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
	}

	public void insertBoard(BoardVO boardVO) {
		boardMapper.insertBoard(boardVO);
		
	}

	public Object selectBoardOne(String bId) {
		return boardMapper.selectBoardOne(bId);
	}

	public void updateBoard(BoardVO boardVO) {
		boardMapper.updateBoard(boardVO);
		
	}

	public void deleteBoard(BoardVO boardVO) {
		boardMapper.deleteBoard(boardVO);
		
	}

}
