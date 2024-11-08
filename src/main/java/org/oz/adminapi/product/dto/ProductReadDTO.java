package org.oz.adminapi.product.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.oz.adminapi.common.domain.AttachFile;
import org.oz.adminapi.maker.domain.MakerEntity;
import org.oz.adminapi.product.domain.ProductEntity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductReadDTO {
    private Long productNo;

    // 상품 정보
    private String productName;
    private String productDescription;

    // 상품 승인 상태
    private int productStatus;

    // 제작자 이름
    private String makerName;

    //카테고리 번호, 이름
    private List<Long> categoriesNo;
    private List<String> categoriesName;

    //제작자 상품 이미지
    private List<String> attachFileNames;

    private LocalDateTime createDate;

    private LocalDateTime lastModifiedDate;

    private String creatorName;

}