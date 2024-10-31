package com.example.demo.dao;

import jakarta.persistence.AttributeConverter;

public class GenderConverter implements AttributeConverter<Gender, String> {
    @Override
    public String convertToDatabaseColumn(Gender gender) {
        return gender.getDbvalue();
    }

    @Override
    public Gender convertToEntityAttribute(String s) {
        return Gender.getGenderByValue(s).orElse(Gender.BOY);
    }
}
