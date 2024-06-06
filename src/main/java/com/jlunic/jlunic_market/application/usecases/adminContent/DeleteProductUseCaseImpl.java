package com.jlunic.jlunic_market.application.usecases.adminContent;

import com.jlunic.jlunic_market.domain.ports.input.adminContent.DeleteProductUseCase;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductUseCaseImpl implements DeleteProductUseCase
{
    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public boolean deleteProduct(Long productId) { return productRepositoryPort.deleteById(productId);}
}
