package com.example.securtiynew.mapper;

import com.example.securtiynew.dto.RegisterRequest;
import com.example.securtiynew.entity.User;
import com.example.securtiynew.security.MyUserDetails;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    MyUserDetails toMyUserDetails(User user);

    User toUserFromRegisterRequest(RegisterRequest registerRequest);
}
