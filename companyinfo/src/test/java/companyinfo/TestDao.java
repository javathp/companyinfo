package companyinfo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.CiCyclePicMapper;
import pojo.CiCyclePic;
import service.CyclePicService;
import service.impl.CyclePicServiceImpl;

/**
* @author papersun  zh17286540@163.com
* @version 2017年6月27日 下午6:55:06 
*/
public class TestDao {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		CyclePicService bean = applicationContext.getBean(CyclePicService.class);
		System.out.println(bean.getid().toString());;
		
	}
}
