package com.gmail.renish.ecommerce.dto.perfume;

import com.gmail.renish.ecommerce.enums.SearchPerfume;
import lombok.Data;

@Data
public class SearchTypeRequest {
    private SearchPerfume searchType;
    private String text;
}
