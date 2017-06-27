package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CiCyclePicMapper;
import pojo.CiCyclePic;
import pojo.CiCyclePicExample;
import service.CyclePicService;

/**
* @author papersun  zh17286540@163.com
* @version 2017年6月27日 下午7:00:58 
*/
@Service
public class CyclePicServiceImpl implements CyclePicService {
	@Autowired
	private CiCyclePicMapper cyclePic;
	
	private List<CiCyclePic> selectByExample;
	
	public String getid() {
		cyclePic.selectByPrimaryKey(1);
		return "================";
	}

}
