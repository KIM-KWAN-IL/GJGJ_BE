package com.example.ggj_be.domain.member.service;

import com.example.ggj_be.domain.auth.dto.AuthRequest;
import com.example.ggj_be.domain.member.Member;

public interface MemberQueryService {
    Member checkAccountIdandPwd(AuthRequest.LoginRequest loginRequest);
}
