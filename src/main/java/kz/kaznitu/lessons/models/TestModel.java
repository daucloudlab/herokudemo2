package kz.kaznitu.lessons.models;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id ;
    @Column(name = "title")
    private String title ;

    public TestModel(){}
    public TestModel(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
