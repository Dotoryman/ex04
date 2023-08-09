package com.yedam.app.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.board.service.BoardService;
import com.yedam.app.domain.BoardVO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*-context.xml"})
@Slf4j
public class BoardServiceTest {

	
	@Autowired
	BoardService boardService;
	
	
	@Test
	public void getList() {
		boardService.getList();
		
		BoardVO vo = new BoardVO();
		vo.setContent("test¿‘¥œ¥Ÿ.");
		boardService.insert(vo);
	}
}
