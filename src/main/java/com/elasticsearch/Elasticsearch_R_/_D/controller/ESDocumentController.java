package com.elasticsearch.Elasticsearch_R_._D.controller;

import com.elasticsearch.Elasticsearch_R_._D.model.ESDocument;
import com.elasticsearch.Elasticsearch_R_._D.repository.ESDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ESDocumentController {

    @Autowired
    private ESDocumentRepository documentRepository;

    @RequestMapping("/")
    public String SpringBootESExample() {
        return "Welcome to Spring Boot Elastic Search Example";
    }

    @DeleteMapping("/delete")
    public String deleteAllDocuments() {
        try {   //delete all documents from solr core
            documentRepository.deleteAll();
            return "documents deleted successfully!";
        }catch (Exception e){
            return "Failed to delete documents";
        }
    }

    @PostMapping("/save")
    public String saveAllDocuments() {
        //Store Documents
        documentRepository.saveAll(Arrays.asList(new ESDocument("1", "pdf","Java Dev Zone"),
                new ESDocument("2", "msg", "subject:reinvention"),
                new ESDocument("3", "pdf", "Spring boot sessions"),
                new ESDocument("4", "docx", "meeting agenda"),
                new ESDocument("5", "docx", "Spring boot + Elastic Search")));
        return "5 documents saved!!!";
    }
    @GetMapping("/getAll")
    public List<ESDocument> getAllDocs() {
        List<ESDocument> documents = new ArrayList<>();
        // iterate all documents and add it to list
        for (ESDocument doc : this.documentRepository.findAll()) {
            documents.add(doc);
        }
        return documents;
    }

}
