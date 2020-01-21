package com.qf.dao;

import com.qf.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    public Admin adminLogin(@Param("NAME") String NAME, @Param("pwd") String pwd);

    public int addAdmin(Admin admin);
}
