package com.book.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.dto.BoardDTO;
import com.book.store.mapper.BoardMapper;

//BoardService 인터페이스를 구현한 클래스
@Service// 로직처리(서비스 레이어, 내부에서 자바 로직을 처리함)
public class BoardServiceImpl implements BoardService{
	
	// BoardController -> BoardService(I) -> BoardServiceImpl(C)->
	// BoardMapper(I) -> boardMapper.xml 이런 순서임
		
	//boardMapper에 있는 sql문을 BoardServiceImpl로 읽어와서 의존성주입하여 객체생성 한것.	
	@Autowired
	private BoardMapper boardMapper;// BoardMapper의 의존성 주입
	//역전의제어, 의존성주입
	
	@Override
	public int maxNum() throws Exception {
		return boardMapper.maxNum();
	}

	@Override
	public void insertData(BoardDTO dto) throws Exception {
		boardMapper.insertData(dto);
		
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return boardMapper.getDataCount(searchKey, searchValue);
	}

	@Override
	public List<BoardDTO> getLists(int start, int end, String searchKey, String searchValue) throws Exception {
		return boardMapper.getLists(start, end, searchKey, searchValue);
	}

	@Override
	public BoardDTO getReadData(int boardNum) throws Exception {
		return boardMapper.getReadData(boardNum);
	}

	@Override
	public void updateHitCount(int boardNum) throws Exception {
		boardMapper.updateHitCount(boardNum);
		
	}

	@Override
	public void updateData(BoardDTO dto) throws Exception {
		boardMapper.updateData(dto);
		
	}

	@Override
	public void deleteData(int boardNum) throws Exception {
		boardMapper.deleteData(boardNum);
		
	}

	@Override
	public BoardDTO preReadData(int boardNum, String subject, String searchKey, String searchValue)
			throws Exception {
		return boardMapper.preReadData(boardNum, subject, searchKey, searchValue);
	}

	@Override
	public BoardDTO nextReadData(int boardNum, String subject, String searchKey, String searchValue) throws Exception {
		return boardMapper.nextReadData(boardNum, subject, searchKey, searchValue);
	}

	
	
	
	
}
