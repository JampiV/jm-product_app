package com.jlunic.jlunic_market.infraestructure.config;

import com.jlunic.jlunic_market.application.services.ProductService;
import com.jlunic.jlunic_market.application.services.RoleService;
import com.jlunic.jlunic_market.application.services.UserService;
import com.jlunic.jlunic_market.application.usecases.adminContent.CreateProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.DeleteProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.RetrieveProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminContent.UpdateProductUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminSystem.ManageContUsersUseCaseImpl;
import com.jlunic.jlunic_market.application.usecases.adminSystem.ManageRoleUseCaseImpl;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import com.jlunic.jlunic_market.domain.ports.output.RoleRepositoryPort;
import com.jlunic.jlunic_market.domain.ports.output.UserRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaProductRepositoryAdapter;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaRoleRepositoryAdapter;
import com.jlunic.jlunic_market.infraestructure.repositories.JpaUserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

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
    public UserService userService(UserRepositoryPort userRepositoryPort, PasswordEncoder passwordEncoder)
    {
        return new UserService(
                new ManageContUsersUseCaseImpl(userRepositoryPort, passwordEncoder)
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

    @Bean
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter)
    {
      return jpaUserRepositoryAdapter;
    }
}
