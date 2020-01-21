package com.qf.dao;

import com.qf.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMapper {

    public List<Class> findAllClass();

    public Class selClassById(Integer id);

    public int addClass(Class aClass);

    public int updateClassById(Class aClass);

    public int delClassById(Integer id);
}
