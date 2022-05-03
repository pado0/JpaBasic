package firstPractice;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{

    private String director;
    public String actor;
}
