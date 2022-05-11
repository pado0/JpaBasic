package jpqlPractice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JpqlProduct {

    @Id @GeneratedValue
    @Column(name = "JPQL_PRODUCE_ID")
    private Long id;
    private String name;
    private int price;
    private int stockAmount;

}
