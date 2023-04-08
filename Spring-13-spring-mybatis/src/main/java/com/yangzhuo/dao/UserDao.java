package com.yangzhuo.dao;

import com.yangzhuo.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface UserDao {
    @Insert("insert into stu(id,name,age,sex)values (#{id},#{name},#{age},#{sex})")
    void save(User user);
    @Update("update stu set  name = #{name}, age=#{age}, sex=#{sex}  where id = #{id} ")
    void update(User user);
    @Delete("delete from stu where id = #{id} ")
    void delete(Integer id);
    @Select("select * from stu where id = #{id} ")
    User findById(int id);
    @Select("select * from stu")
    List<User> findAll();

}
