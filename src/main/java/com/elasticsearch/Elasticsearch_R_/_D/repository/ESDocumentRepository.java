package com.elasticsearch.Elasticsearch_R_._D.repository;

import com.elasticsearch.Elasticsearch_R_._D.model.ESDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ESDocumentRepository extends ElasticsearchRepository<ESDocument, String> {

    List<ESDocument> findByDocTitleEndsWith(String name);
    List<ESDocument> findByDocTitleStartsWith(String name);
    List<ESDocument> findByDocTypeEndsWith(String name);
    List<ESDocument> findByDocTypeStartsWith(String name);

    //Page<Book> findByAuthor(String author, Pageable pageable);

    //List<ESDocument> findByTitle(String title);

}
