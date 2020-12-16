import java.util.List;

import org.hibernate.Session;

import com.revature.pirate.dao.DatabasePirateDAO;
import com.revature.pirate.dao.DatabaseRoleDAO;
import com.revature.pirate.model.Pirate;
import com.revature.pirate.servlet.HelloServlet;
import com.revature.pirate.util.HibernateUtility;

public class App extends HelloServlet{
	public static void main(String[] args){
//		PirateRepository pirateRepository = new PirateRepository();
//		PirateLogic pirateLogic = new PirateLogic();
//		
//		//Ask for user input
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the name of the pirate!");
//		
//		String name = scanner.nextLine();
//		ArrayList<Pirate> pirates = pirateRepository.readFile();
//
//		//output all of the pirates
//		pirateLogic.showPirates(pirates);
//		
//		System.out.println("What role do you want this pirate to have");
//		String role = scanner.nextLine();
//		pirateLogic.setPirate(pirates, name, role);
//			
//		
//		pirateLogic.showPirates(pirates);
//		scanner.close();
//		Logger logger = Logger.getLogger(App.class);
//		logger.debug("Logger Works! (Log4j 1)");
		HibernateTest();
	}
	
	
	public static void HibernateTest() {
		System.out.println(System.getenv());
		
		DatabaseRoleDAO rDAO = new DatabaseRoleDAO();
		DatabasePirateDAO pDAO = new DatabasePirateDAO();
		try (Session session = HibernateUtility.getSession()) {
//			Transaction tx = session.beginTransaction();
			
//			Role role1 = new Role("Cook");
//			
//			int id = (int) session.save(role1);
//			System.out.println(id);
			
			
//			tx.commit();
			
//			Test of findRoleByName hibernate implementation
//			Role role = rDAO.findRoleByName("bannana");
//			System.out.println(role);
			
//			Test of pirateDAO getAllPirates() hibernate implementation
			List<Pirate> pirates = pDAO.getAllPirates();
			System.out.println(pirates);
			
			
//			Test of PirateDAO insertPirate() hibernate implementation
//			Role role = rDAO.findRoleByName("Cook");
//			Pirate pirate = pDAO.insertPirate("Bach", role);
//			System.out.println(pirate);	
			
		}
	}


	
	
	
}
