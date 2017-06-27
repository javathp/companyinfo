package dao;

import java.util.List;
import pojo.CiHeaderandfooterData;
import pojo.CiHeaderandfooterDataExample;

public interface CiHeaderandfooterDataMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(CiHeaderandfooterData record);

    int insertSelective(CiHeaderandfooterData record);

    List<CiHeaderandfooterData> selectByExample(CiHeaderandfooterDataExample example);

    CiHeaderandfooterData selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(CiHeaderandfooterData record);

    int updateByPrimaryKey(CiHeaderandfooterData record);
}