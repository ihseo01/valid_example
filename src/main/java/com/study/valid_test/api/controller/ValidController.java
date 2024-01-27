package com.study.valid_test.api.controller;

import com.study.valid_test.common.url.Url;
import com.study.valid_test.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Valid", description = "DTO Valid API")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Url.api + Url.v1)
public class ValidController {

    @Operation(summary = "Valid Check API", description = "Valid 체크 테스트")
    @GetMapping(Url.valid)
    public ResponseEntity<?> testValid(@Valid UserDto userDto) {
        return ResponseEntity.ok("Valid check Success");
    }
}
