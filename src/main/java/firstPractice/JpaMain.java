package firstPractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        //emf 만드는 순간 db와 연결 된다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        // db에서는 트랜젝션이 중요하다
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

            Order order = new Order();
            //order.addOrderItem(new OrderItem());

            // 양방향 연관관계가 아니어도.. 무방하다는 예제
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);

            em.persist(orderItem);

            tx.commit();

        }catch (Exception e){
            tx.rollback();

        }finally {

            em.close();
        }

        emf.close();

    }
}
