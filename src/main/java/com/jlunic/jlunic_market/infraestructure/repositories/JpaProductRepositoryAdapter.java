package com.jlunic.jlunic_market.infraestructure.repositories;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.entities.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class JpaProductRepositoryAdapter implements ProductRepositoryPort
{
    private final JpaProductRepository jpaProductRepository;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = ProductEntity.fromDomainModel(product);
        ProductEntity savedProductEntity = jpaProductRepository.save(productEntity);
        return savedProductEntity.toDomainModel();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return jpaProductRepository.findById(id).map(ProductEntity::toDomainModel);
    }

    @Override
    public List<Product> findAll() {
        return jpaProductRepository.findAll().stream()
                .map(ProductEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Product> update(Product product) {
        if(jpaProductRepository.existsById(product.getId()))
        {
            ProductEntity productEntity = ProductEntity.fromDomainModel(product);
            ProductEntity updatedProductEntity = jpaProductRepository.save(productEntity);
            return Optional.of(updatedProductEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaProductRepository.existsById(id))
        {
            jpaProductRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
