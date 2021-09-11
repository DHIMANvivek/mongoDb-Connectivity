package com.vivekdhiman.Control;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.vivekdhiman.model.Access;

public class DataBase {
	
	
	MongoClient mongoClient ;
	
	public DataBase() {
		
		try {
			String url = "mongodb+srv://androidvivek:vivek@cluster0.ay1mh.mongodb.net/androidvivek?retryWrites=true&w=majority";
			mongoClient = MongoClients.create(url);
			System.out.println("Server Created");
			
		} catch (Exception e) {
			
			System.out.println("Erorr : "+e);
			
		}
	}
		
		
		public void  fetching() {
			
	
		try {
			
			Document document = new Document(Access.toMap());
			mongoClient.getDatabase("vivekyoutube").getCollection("auth").insertOne(document);
			
			System.out.println("Document Inserted :)");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		}
	
		
		
	}

