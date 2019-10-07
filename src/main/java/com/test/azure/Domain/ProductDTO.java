package com.test.azure.Domain;


import javax.persistence.*;

@Entity
@Table(name = "Product_test")
public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ProductId")
    private int productId;

    @Column(name="ProductName")
    private String productName;

    public ProductDTO() {
    }

    public ProductDTO(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

