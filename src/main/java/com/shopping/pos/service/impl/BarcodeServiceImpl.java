package com.shopping.pos.service.impl;

import com.shopping.pos.dto.request.CreateBarcodeRequest;
import com.shopping.pos.entity.Barcode;
import com.shopping.pos.mapper.BarcodeMapper;
import com.shopping.pos.repository.BarcodeRepository;
import com.shopping.pos.service.BarcodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BarcodeServiceImpl implements BarcodeService {

    private final BarcodeRepository barcodeRepository;
    private final BarcodeMapper barcodeMapper;

    @Override
    public Barcode createBarcode(CreateBarcodeRequest barcodeRequest) {
        Barcode existingBarcode = findBySerialNumber(barcodeRequest.getSerialNumber());

        if (existingBarcode != null) {
            return existingBarcode;
        }

        Barcode newBarcode = barcodeMapper.toEntity(barcodeRequest);
        barcodeRepository.save(newBarcode);

        return newBarcode;
    }

    @Override
    public Barcode findBySerialNumber(Long serialNumber) {
        return barcodeRepository.findBySerialNumber(serialNumber)
                .orElse(null);
    }
}

