package one.digitalinnovation.projetodioproductcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

// indexName seriam as "tabelas" do elasticsearch
@Document(indexName = "product", type = "catalog") // informacoes de como o Produto será persistido no Elasticsearch
public class Product {
    @Id // especifica o campo de ID unico
    private Integer id;
    private String name;
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
