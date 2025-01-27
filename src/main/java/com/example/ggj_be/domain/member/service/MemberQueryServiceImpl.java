package com.example.ggj_be.domain.member.service;

import com.example.ggj_be.domain.member.repository.MemberRepository;
import jakarta.persistence.Cacheable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class MemberQueryServiceImpl implements MemberQueryService{
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptEncoder;

    @Override
    @Cacheable(value = "members", key = "#id")
}
