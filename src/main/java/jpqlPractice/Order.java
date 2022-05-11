package jpqlPractice;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id @GeneratedValue
    private Long id;
    private int orderAmount;

    @Embedded
    private Address address;

    @ManyToOne
    @JoinColumn(name = "JPQL_PRODUCT_ID")
    private JpqlProduct jpqlProduct;
}
