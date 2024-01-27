package com.study.valid_test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {
    @NotBlank(message = "이름을 확인해주세요.")
    @JsonProperty("name")
    private String name;
    @Min(value = 0, message = "나이를 확인해주세요.")
    @JsonProperty("age")
    private int age;
    @Email
    @NotBlank(message = "이메일을 확인해주세요.")
    @JsonProperty("email")
    private String email;

    @Builder
    public UserDto(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
