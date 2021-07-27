package com.example.hotel;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DataBasePusher {

    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase processes = mongoClient.getDatabase("processes");
    MongoCollection<Document> collection = processes.getCollection("hotelRegistrations");

    public void pushVisitor(Visitor visitor){
        Document Person = new Document();
        Person.put("Name", visitor.getRegistrationName());
        Person.put("Email", visitor.getEmail());
        Person.put("StartLiving", visitor.getStartLiving());
        Person.put("FinishLiving", visitor.getFinishLiving());

        collection.insertOne(Person);
    }

}
