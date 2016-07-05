package org.jone.zdao;
//...과제22-5.C. /z09_sts372/src/main/java/org/joywins/zdao/IF_MemberDAO.java 생성.
import org.jone.zdomain.MemberVO;

/***
 * DAO = Persistence 패키지.
 * @author Administrator
 *
 */

public interface IF_MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid)throws Exception;
	  
	public MemberVO readWithPW(String userid, 
				String userpw)throws Exception;	

}
