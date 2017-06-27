package dao;

import java.util.List;
import pojo.CiNotice;
import pojo.CiNoticeExample;

public interface CiNoticeMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(CiNotice record);

    int insertSelective(CiNotice record);

    List<CiNotice> selectByExample(CiNoticeExample example);

    CiNotice selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(CiNotice record);

    int updateByPrimaryKey(CiNotice record);
}