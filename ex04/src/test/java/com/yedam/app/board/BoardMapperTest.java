package com.yedam.app.board;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.board.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*-context.xml"})
@Slf4j
public class BoardMapperTest {
	
	
	@Autowired
	BoardMapper boardMapper;
	
	@Test
	public void getList () {
		List<Map<String, Object>> list = boardMapper.getList();
		log.info(list.toString());
	}
}
