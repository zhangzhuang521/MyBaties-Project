package com.itcast.mapper;

import com.itcast.domain.Subject;

import java.util.List;

public interface SubjectMapper {
    public abstract List<Subject> findAll();
}
