package dao;

import java.util.List;
import pojo.CiCyclePic;
import pojo.CiCyclePicExample;

public interface CiCyclePicMapper {
    int deleteByPrimaryKey(int id);

    int insert(CiCyclePic record);

    int insertSelective(CiCyclePic record);

    List<CiCyclePic> selectByExample(CiCyclePicExample example);

    CiCyclePic selectByPrimaryKey(int i);

    int updateByPrimaryKeySelective(CiCyclePic record);

    int updateByPrimaryKey(CiCyclePic record);
}