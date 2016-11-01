package springmvcdemo.test;
import org.junit.Test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.domain.User;
import test.service.IUserService;

import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestAddUser{
	private static Logger logger = Logger.getLogger(TestAddUser.class);  
//  private ApplicationContext ac = null;  
    @Resource(name="userService")
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
   @Test
   public void testAddUser() {
    	User userById = this.userService.getUserById(1);
    	System.out.println(userById.toString());
   }

}
