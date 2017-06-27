package dao;

import java.util.List;
import pojo.CiCyclePic;
import pojo.CiCyclePicExample;

public interface CiCyclePicMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(CiCyclePic record);

    int insertSelective(CiCyclePic record);

    List<CiCyclePic> selectByExample(CiCyclePicExample example);

    CiCyclePic selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(CiCyclePic record);

    int updateByPrimaryKey(CiCyclePic record);
}