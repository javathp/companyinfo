package dao;

import java.util.List;
import pojo.CiUser;
import pojo.CiUserExample;

public interface CiUserMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(CiUser record);

    int insertSelective(CiUser record);

    List<CiUser> selectByExample(CiUserExample example);

    CiUser selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(CiUser record);

    int updateByPrimaryKey(CiUser record);
}