package org.joywins.test;

//...과제24-2.I. /z09_sts372/src/test/java/org/joywins/test/CloseDAOTest.java 생성.
import static org.junit.Assert.*;

import java.util.List;

import org.jone.zdao.IF_ZCloseDAO;
import org.jone.zdomain.EmpVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ZCloseDAOTest {

	private IF_ZCloseDAO dao;

	private static Logger logger = LoggerFactory.getLogger(ZCloseDAOTest.class);

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void listAll_close009() throws Exception {

		List<EmpVO> list = dao.listAll_close009();
		
		logger.info("listAll_close009 with list = " + list);

		for (EmpVO empVO : list) {
			logger.info("testListCriteria : " + empVO.getEMPNO() + ":" + empVO.getENAME());
		}
	}

}