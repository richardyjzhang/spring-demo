package me.zhangrichard.nacosprovider;

import me.zhangrichard.nacoscommon.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT `id`, `name` FROM `test`.`user`")
    List<User> getAllUsers();
}
