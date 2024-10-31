package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum Gender {
    BOY("boy", "1"), GIRL("girl", "2");
    private String detail;
    private String dbvalue;
    public static Optional<Gender> getGenderByValue(String dbvalue) {
        return Arrays.stream(Gender.values()).filter(g -> g.dbvalue.equals(dbvalue)).findFirst();
    }
}
