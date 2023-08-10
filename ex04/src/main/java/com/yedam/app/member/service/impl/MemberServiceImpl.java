package com.yedam.app.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yedam.app.domain.MemberVO;
import com.yedam.app.member.mapper.MemberMapper;
import com.yedam.app.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService, UserDetailsService{
	@Autowired MemberMapper memberMapper;
	
	public MemberVO read(String userid) {
		return memberMapper.read(userid);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO vo = memberMapper.read(username);
		if(vo == null) {
			throw new UsernameNotFoundException("!!!userid not found!!!");
		}
		return vo;
	}
}
