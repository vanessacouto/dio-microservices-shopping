package one.digitalinnovation.projetodioproductcatalog.repository;

import one.digitalinnovation.projetodioproductcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
