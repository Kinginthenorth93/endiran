package copm.project.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.entity.TvRemote;
import com.project.tvremoteDAO.TvRemoteDAO;

public class Tester {
	public static void main(String[] args) {
		String springConfigFile="ApplicationContext.xml";
		ApplicationContext springContainer=new ClassPathXmlApplicationContext(springConfigFile);
		
		TvRemote remote=new TvRemote();
		remote.setId(1);
		remote.setName("Samsumg101");
		remote.setBrand("Samsumg");
		remote.setColour("Black");
		remote.setPrice(150);
		remote.setNoOfShells(2);
		remote.setIsPowerButtonWorking(true);
		TvRemoteDAO tvremotedao=springContainer.getBean(TvRemoteDAO.class);
		tvremotedao.addTvRemoteEntity(remote);
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext=(ClassPathXmlApplicationContext) springContainer;
		classPathXmlApplicationContext.close();
		
	
		 
		
	}

}
