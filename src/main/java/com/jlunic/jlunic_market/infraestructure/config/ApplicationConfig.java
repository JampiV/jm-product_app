package com.jlunic.jlunic_market.infraestructure.config;

import com.jlunic.jlunic_market.application.services.ProductService;
import com.jlunic.jlunic_market.application.usecases.adminContent.CreateProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.DeleteProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.RetrieveProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.UpdateProductUseCaseImpl;
import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.CreateProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.DeleteProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.RetrieveProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.UpdateProductUseCase;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaProductRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    //TO DO


    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort)
    {
        return new ProductService(
                new CreateProductUseCaseImpl(productRepositoryPort),
                new RetrieveProductUseCaseImpl(productRepositoryPort),
                new UpdateProductUseCaseImpl(productRepositoryPort),
                new DeleteProductUseCaseImpl(productRepositoryPort)
                );
    }


    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter)
    {
        return jpaProductRepositoryAdapter;
    }

}
