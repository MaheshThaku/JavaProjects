// @ Developed by Mahesh Thakur
package Student_Mgm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//for configuration of database
public class HibernateUtil {

	public static Session getSeesion() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
