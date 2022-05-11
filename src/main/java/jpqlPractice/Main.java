package jpqlPractice;

import firstPractice.Order;
import firstPractice.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //emf 만드는 순간 db와 연결 된다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        // db에서는 트랜젝션이 중요하다
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Member member = new Member();
            member.setUsername("member1");

            em.persist(member);

            tx.commit();

        }catch (Exception e){
            tx.rollback();

        }finally {

            em.close();
        }

        emf.close();

    }
}
