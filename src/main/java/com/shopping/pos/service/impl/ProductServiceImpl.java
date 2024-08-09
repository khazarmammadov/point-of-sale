package com.shopping.pos.service.impl;


import com.shopping.pos.dto.request.CreateBarcodeRequest;
import com.shopping.pos.dto.request.CreateProductRequest;
import com.shopping.pos.entity.Barcode;
import com.shopping.pos.entity.Product;
import com.shopping.pos.mapper.ProductMapper;
import com.shopping.pos.repository.ProductRepository;
import com.shopping.pos.service.BarcodeService;
import com.shopping.pos.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final BarcodeService barcodeService;

    @Override
    public void createProduct(Long serialNumber, CreateProductRequest productRequest) {

        Barcode barcode = barcodeService.findBySerialNumber(serialNumber);

        if (barcode != null) {

            Product productMapperEntity = productMapper.toEntity(productRequest);
            productMapperEntity.setBarcode(barcode);
            productRepository.save(productMapperEntity);

        } else {
            CreateBarcodeRequest barcodeRequest = new CreateBarcodeRequest();

            barcodeRequest.setBarcodePrefix(productRequest.getModelNum());
            barcodeRequest.setSerialNumber(serialNumber);

            barcode = barcodeService.createBarcode(barcodeRequest);

            Product productMapperEntity = productMapper.toEntity(productRequest);
            productMapperEntity.setBarcode(barcode);
            productRepository.save(productMapperEntity);
        }
    }

    @Override
    public Product findProductByBarcodeId(Long serialNumber) {
        Barcode barcode = barcodeService.findBySerialNumber(serialNumber);

        return productRepository.findProductByBarcode_Id(barcode.getId()).orElse(null);
    }
}
