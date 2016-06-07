package com.beibang.oauth.demo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.beibang.oauth.demo.model.User;

public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO: 在这里用传入的username去找到用户的在数据库里的信息，在下面方面放入密码，系统会自动比对数据库里密码和传入密码是否一致
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword("123");
	    
	    UserDetails userDetails = new MyUserDetails(user, true, true, true, true, getAuthorities());

	    return userDetails;
	}
	
	private List<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<>();
		list.add(new SimpleGrantedAuthority("ROLE_CLIENT"));
		return list;
	}
	
}
