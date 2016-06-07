package com.beibang.oauth.demo.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.beibang.oauth.demo.model.User;

public class MyUserDetails extends org.springframework.security.core.userdetails.User {

    private User user;

    public MyUserDetails(User user, Collection<? extends GrantedAuthority> authorities) {
        super(user.getUsername(), user.getPassword(), authorities);
        this.user = user;
    }

    public MyUserDetails(User user, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(user.getUsername(), user.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}