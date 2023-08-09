package com.yedam.app.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardService;
import com.yedam.app.domain.BoardVO;

import lombok.Setter;
@Service
public class BoardServiceImpl implements BoardService{

	@Setter(onMethod_ = @Autowired)
	BoardMapper mapper;
	
	@Override
	public List<Map<String, Object>> getList() {
		return mapper.getList();
	}

	@Override
	public int insert(BoardVO vo) {
		return 0; 
	}

}
