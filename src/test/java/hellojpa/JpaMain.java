package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
//   public static void main(String[] args) {
//
//        //emf 만드는 순간 db와 연결 된다.
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//
//        // db에서는 트랜젝션이 중요하다
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        // code 작성부, h2콘솔에서 member table 만들고 시작
//        try {
//
//            // 아직 비영속 상태
//            /*Member member = new Member();
//            member.setId(5L);
//            member.setName("김수진");
//
//            // member 저장. 이제 영속상태. 아직 db에 저장되지 않음.
//            em.persist(member);
//
//            // find만 해줘도 1차캐시에 저장되며 영속됨
//            Member findMember = em.find(Member.class, 2L); // find member를 해도 db 쿼리가 안나감
//            Member findMember2 = em.find(Member.class, 2L);
//
//            // detach, 이제 영속성으로 관리하지 않음. 업데이트 쿼리가 안나감
//            findMember.setName("이름바꾸기테스트2");
//            //em.detach(findMember);
//
//            em.clear(); //전체 초기화
//            Member findMember3 = em.find(Member.class, 2L); //다시 영속성으로 관리, 쿼리가 두 번 나
//
//
//            System.out.println("findMember = " + findMember.getName());
//            System.out.println("isSame? = " + (findMember == findMember2));
//            // 준영속, 이제 엔티티매니저에서 삭제
//            //em.detach(member);
//
//
//            // 찾기 (em이 db 저장을 위한 자바 컬렉션 역할을 해준다 생각하기)
//            /*
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.getName() = " + findMember.getName());
//
//            // 삭제
//            Member findMember1 = em.find(Member.class, 1L);
//            em.remove(findMember1);
//
//            // 수정, 기가막히다. set만 해줘도 수정이 된다. JPA를 통해 엔티티를 가져오면, 데이터가 변경되었는지 commit 시점에 체크하고 업데이트
//            Member findMember2 = em.find(Member.class, 2L);
//            findMember2.setName("김소진");
//            */
//            // 커밋 시점에 db에 쿼리가 날아감.
//            tx.commit();
//
//        }catch (Exception e){
//            tx.rollback();
//        }finally {
//            em.close();
//        }
//        emf.close();
//    }
//    */
}
