package one.digitalinnovation.projetodioproductcatalog.controller;

import one.digitalinnovation.projetodioproductcatalog.model.Product;
import one.digitalinnovation.projetodioproductcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController // aponta para o Spring que tudo aqui será um seriço REST
@RequestMapping(value = "/product") // basicamente a rota do serviço
public class ProductController {

    @Autowired // Spring injeta o productRepository
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }
}
