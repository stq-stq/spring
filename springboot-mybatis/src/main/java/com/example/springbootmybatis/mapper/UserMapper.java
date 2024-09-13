package com.example.springbootmybatis.mapper;
import com.example.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById (Integer id);
}
