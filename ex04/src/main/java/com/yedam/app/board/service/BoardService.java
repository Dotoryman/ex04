package com.yedam.app.board.service;

import java.util.List;
import java.util.Map;

import com.yedam.app.domain.BoardVO;

public interface BoardService {
	public List<Map<String, Object>> getList();
	int insert(BoardVO vo);
}
