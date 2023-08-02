package tuong.java6.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Categories {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     @Column(name = "categoryname")
     private String categoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
