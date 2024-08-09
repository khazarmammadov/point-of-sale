package com.shopping.pos.service;

import com.shopping.pos.dto.request.CreateBarcodeRequest;
import com.shopping.pos.entity.Barcode;

import java.util.List;
import java.util.Optional;

public interface BarcodeService {

    Barcode createBarcode(CreateBarcodeRequest barcodeRequest);
    Barcode findBySerialNumber(Long serialNumber);
}
