package com.gebruderzulfajstock.controllers;

import com.gebruderzulfajstock.dtos.DiscountDto;
import com.gebruderzulfajstock.dtos.IncrementDto;
import com.gebruderzulfajstock.dtos.ProductDto;
import com.gebruderzulfajstock.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-product")
@CrossOrigin(origins = {
        "https://www.xn--stock-gebrderzulfaj-fbc.com",
        "https://gebruderzulfaj-front-eqtf4ehrp-erblinzulfajs-projects.vercel.app"
})
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping
    public List<ProductDto> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<ProductDto> getProductByCode(@PathVariable String code) {
        ProductDto product = service.getProductByCode(code);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @GetMapping("/original-name/{name}")
    public ResponseEntity<ProductDto> getProductByOriginalName(@PathVariable String name) {
        ProductDto product = service.getProductByOriginalName(name);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @GetMapping("/common-name/{name}")
    public ResponseEntity<ProductDto> getProductByCommonName(@PathVariable String name) {
        ProductDto product = service.getProductByCommonName(name);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @GetMapping("/less-quantity")
    public List<ProductDto> getAllLessQuantity() {
        return service.findAllLessQuantity();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public void add(@RequestBody ProductDto dto) {
        service.add(dto);
    }

    @PutMapping("/increment/{id}")
    public void incrementQuantity(@PathVariable long id, @RequestBody double quantityAdded) {

        service.incrementQuantity(id, quantityAdded);
    }

    @PutMapping("/decrement/{id}")
    public void decrementQuantity(@PathVariable long id, @RequestBody double quantityDiscount) {
        service.decrementQuantity(id, quantityDiscount);
    }

    @PutMapping("/{id}")
    public void updatedProduct(@PathVariable long id, @RequestBody ProductDto dto) {
        service.modify(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        service.removeById(id);
    }

    @GetMapping("/discount-history")
    public List<DiscountDto> getDiscountHistory() {
        return service.getDiscountHistory();
    }

    @GetMapping("/increment-history")
    public List<IncrementDto> getIncrementHistory() {
        return service.getIncrementHistory();
    }

}
