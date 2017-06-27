package dao;

import java.util.List;
import pojo.CiMainitemData;
import pojo.CiMainitemDataExample;

public interface CiMainitemDataMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(CiMainitemData record);

    int insertSelective(CiMainitemData record);

    List<CiMainitemData> selectByExample(CiMainitemDataExample example);

    CiMainitemData selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(CiMainitemData record);

    int updateByPrimaryKey(CiMainitemData record);
}