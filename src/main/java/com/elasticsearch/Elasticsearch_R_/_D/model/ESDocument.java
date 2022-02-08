package com.elasticsearch.Elasticsearch_R_._D.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employee", type = "employee")
public class ESDocument {

    @Id
    private String id;
    private String docType;
    private String docTitle;

    public ESDocument() {
    }

    public ESDocument(String id, String docType, String docTitle){
        this.id = id;
        this.docTitle = docTitle;
        this.docType = docType;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", docType='" + docType + '\'' +
                ", docTitle='" + docTitle + '\'' +
                '}';
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

}
