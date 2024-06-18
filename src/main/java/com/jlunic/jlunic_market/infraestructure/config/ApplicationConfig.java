package com.jlunic.jlunic_market.infraestructure.config;

import com.jlunic.jlunic_market.application.services.ProductService;
import com.jlunic.jlunic_market.application.services.RoleService;
import com.jlunic.jlunic_market.application.usecases.adminContent.CreateProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.DeleteProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.RetrieveProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.UpdateProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminSystem.ManageRoleUseCaseImpl;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import com.jlunic.jlunic_market.domain.ports.output.RoleRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaProductRepositoryAdapter;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaRoleRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

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
    public RoleService roleService(RoleRepositoryPort roleRepositoryPort)
    {
        return new RoleService(
                new ManageRoleUseCaseImpl(roleRepositoryPort)
        );
    }


    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter)
    {
        return jpaProductRepositoryAdapter;
    }

    @Bean
    public RoleRepositoryPort roleRepositoryPort(JpaRoleRepositoryAdapter jpaRoleRepositoryAdapter)
    {
        return jpaRoleRepositoryAdapter;
    }
}
