package org.joywins.test;

import javax.inject.Inject;

import org.jone.zdao.IF_MemberDAO;
import org.jone.zdomain.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private IF_MemberDAO dao;
	
	@Test
	public void testTime()throws Exception{
		
		System.out.println("zweb.testTime() = " + dao.getTime());
		
	}
	
	@Test
	public void testInsertMember()throws Exception{
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user02");
		vo.setUserpw("user02");
		vo.setUsername("USER02");
		vo.setEmail("user02@aaa.com");
		
		dao.insertMember(vo);
		
	}	

}


