package com.example.projectregistrpeple.auth;
import com.example.projectregistrpeple.domain.users.Role;
import com.example.projectregistrpeple.domain.users.Users;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@AllArgsConstructor
public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {


    Users users;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Role role = users.getRole(); // Получили роль из нашего юзера

        if (role == null) { // Проверяем есть ли роль вообще
            return Collections.EMPTY_LIST;
        } // еслди роли нет возвращаем пустой список

        return Stream.of(role)
                .map(r -> new SimpleGrantedAuthority(r.getId()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return users.getPassword();
    }

    @Override
    public String getUsername() {
        return users.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
