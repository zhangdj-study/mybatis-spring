package org.mybatis.test.mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.test.model.UserDO;

/**
 * @author zhangdj
 * @date 2020/11/13
 */
public interface UserMapper {

  @Select("select * from t_user where id = #{id}")
  UserDO queryById(Long id);
}
