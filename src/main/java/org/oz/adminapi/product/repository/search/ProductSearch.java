package org.oz.adminapi.product.repository.search;

import org.oz.adminapi.common.dto.PageRequestDTO;
import org.oz.adminapi.common.dto.PageResponseDTO;
import org.oz.adminapi.product.dto.ProductListDTO;
import org.springframework.http.ResponseEntity;

public interface ProductSearch {

    PageResponseDTO<ProductListDTO> productList (PageRequestDTO pageRequestDTO);
}
