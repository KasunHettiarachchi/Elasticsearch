package com.elasticsearch.Elasticsearch_R_._D;

import com.elasticsearch.Elasticsearch_R_._D.model.ESDocument;
import com.elasticsearch.Elasticsearch_R_._D.service.ESDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {
//public class Application implements CommandLineRunner {		//implements CommandLineRunner for @Override method
//
//	@Autowired
//	private ESDocumentService esDocumentService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<ESDocument> docs = esDocumentService.findByTitle("meeting agenda");
//		docs.forEach(x -> System.out.println(x));
//	}

}
