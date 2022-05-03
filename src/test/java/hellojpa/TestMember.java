package hellojpa;

import javax.persistence.*;
import java.util.Date;

// 관례상 테이블 명은 클래스 명을 따른다. 특정 테이블에 매핑하고 싶으면 @Table(name =) 으로 매핑
//@Entity
public class TestMember {

    @Id // pk 매핑
    private Long id;

    @Column(name = "name") // db엔 name으로 쓰고 객체변수명은 Username으로 하고싶을 때
    private String username;

    private Integer age; // 다른 타입써도 무방

    @Enumerated(EnumType.STRING) // DB에 enum 타입을 쓰고싶을때
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) // 날짜, 날짜+시간 = TIMESTAMP
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob // varchar를 넘어가는 큰 컨텐츠 넣고 싶을 때
    private String description;

    public TestMember(){

    }
}