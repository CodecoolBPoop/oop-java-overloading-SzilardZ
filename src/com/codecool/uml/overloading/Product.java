package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.List;
import java.util.function.Supplier;

public class Product {

    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private List<Product> productList;

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        return -1;
    }

    public List<Product> getAllProductsBy(Supplier supplier) {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultPrice=" + defaultPrice +
                ", defaultCurrency=" + defaultCurrency +
                ", productCategory=" + productCategory +
                ", supplier=" + supplier +
                ", productList=" + productList +
                '}';
    }
}