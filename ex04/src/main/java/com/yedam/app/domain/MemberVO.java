package com.yedam.app.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class MemberVO implements UserDetails{

	private String userid;
	private String userpw;
	private String name;
	private boolean enabled;

	private Date regDate;
	private Date updateDate;
	private List<AuthVO> authList;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> list = new ArrayList<>();
//		for(AuthVO auth : authList) {
//			list.add(new SimpleGrantedAuthority(auth.getAuth()));
//		}
//		return list;
		
		return this.authList.stream()
							.map(auth -> new SimpleGrantedAuthority(auth.getAuth()))
							.collect(Collectors.toList());
	}
	@Override
	public String getPassword() {
		return userpw;
	}
	@Override
	public String getUsername() {
		return userid;
	}
	@Override //Ż��(�޸�) ����
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override // �н����� 5ȸ�̻� ����
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override // �н����� �����ؾ���
	public boolean isCredentialsNonExpired() {
		return true;
	}

}
