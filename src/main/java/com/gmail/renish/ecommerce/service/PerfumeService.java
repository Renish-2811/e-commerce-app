package com.gmail.renish.ecommerce.service;

import com.gmail.renish.ecommerce.domain.Perfume;
import com.gmail.renish.ecommerce.dto.perfume.PerfumeSearchRequest;
import com.gmail.renish.ecommerce.enums.SearchPerfume;
import com.gmail.renish.ecommerce.repository.projection.PerfumeProjection;
import graphql.schema.DataFetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PerfumeService {

    Perfume getPerfumeById(Long perfumeId);

    Page<PerfumeProjection> getAllPerfumes(Pageable pageable);

    List<PerfumeProjection> getPerfumesByIds(List<Long> perfumesId);

    Page<PerfumeProjection> findPerfumesByFilterParams(PerfumeSearchRequest filter, Pageable pageable);

    List<Perfume> findByPerfumer(String perfumer);

    List<Perfume> findByPerfumeGender(String perfumeGender);
    
    Page<PerfumeProjection> findByInputText(SearchPerfume searchType, String text, Pageable pageable);

    Perfume savePerfume(Perfume perfume, MultipartFile file);

    String deletePerfume(Long perfumeId);

    DataFetcher<Perfume> getPerfumeByQuery();

    DataFetcher<List<PerfumeProjection>> getAllPerfumesByQuery();

    DataFetcher<List<Perfume>> getAllPerfumesByIdsQuery();
}
