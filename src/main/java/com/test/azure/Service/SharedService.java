package com.test.azure.Service;

import com.test.azure.Domain.CountDTO;
import com.test.azure.Domain.ProductDTO;

public interface SharedService {
    ProductDTO getProducts();

    CountDTO getCounts();
}
