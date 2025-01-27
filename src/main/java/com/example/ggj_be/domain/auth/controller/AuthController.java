package com.example.ggj_be.domain.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "Auth 관련 API 명세서", description = "로그인, 로그아웃, 토큰 갱신 처리하는 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthController {

}
