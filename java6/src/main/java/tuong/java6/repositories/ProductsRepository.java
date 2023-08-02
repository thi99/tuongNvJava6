package tuong.java6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tuong.java6.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products , Integer> {
}
