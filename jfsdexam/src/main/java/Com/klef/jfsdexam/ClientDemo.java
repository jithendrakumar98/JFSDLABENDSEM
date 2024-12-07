package Com.klef.jfsdexam;
import org.hibernate.cfg.Configuration;

import org.hibernate.*;
public class ClientDemo {
	private static SessionFactory factory;
    public static void main(String[] args) {
        factory = new Configuration().configure().buildSessionFactory();
        UpdateDepartment(8L); 
        factory.close();
    }
    private static void UpdateDepartment(Long departmentId) {
        Session session = factory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            String hql = "Update Department SET name = :name, location = :location WHERE id = :id";
            int result = session.createQuery(hql)
                                .setParameter("name", "CSE")
                                .setParameter("location", "KLU")
                                .setParameter("id", departmentId)
                                .executeUpdate();


            transaction.commit();
            System.out.println("Updated Department with ID: " + departmentId + " Result: " + result);
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
