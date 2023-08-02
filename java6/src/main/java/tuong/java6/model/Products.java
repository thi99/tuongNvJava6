package tuong.java6.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     @Column(name = "productname")
     private String productName;
     @Column(name = "price")
     private Long price;
     @Column(name = "image")
     private String image;
     @ManyToOne
     @JoinColumn(name = "categoryid")
     private Categories category;

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}
