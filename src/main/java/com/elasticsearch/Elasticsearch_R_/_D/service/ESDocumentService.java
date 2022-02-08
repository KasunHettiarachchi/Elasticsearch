package com.elasticsearch.Elasticsearch_R_._D.service;

import com.elasticsearch.Elasticsearch_R_._D.model.ESDocument;
import com.elasticsearch.Elasticsearch_R_._D.repository.ESDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ESDocumentService {

    private ESDocumentRepository esDocumentRepository;

    @Autowired
    public void setBookRepository(ESDocumentRepository esDocumentRepository) {
        this.esDocumentRepository = esDocumentRepository;
    }

//    public List<ESDocument> findByTitle(String title) {
//        return esDocumentRepository.findByTitle(title);
//    }

}
