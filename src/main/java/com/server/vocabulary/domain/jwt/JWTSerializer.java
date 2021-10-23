package com.server.vocabulary.domain.jwt;

import com.server.vocabulary.domain.user.User;

public interface JWTSerializer {

    String jwtFromUser(User user);

}
