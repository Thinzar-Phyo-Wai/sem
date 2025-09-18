package com.napier.sem;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
public class App
{
    public static void main(String[] args)
    {
        // Connect to MongoDB on local system - we're using port 27000
        //MongoClient mongoClient = MongoClients.create("mongodb://localhost:27000");
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        // Get a database - will create when we use it
        MongoDatabase database = mongoClient.getDatabase("mydb");
        // Get a collection from the database
        MongoCollection<Document> collection = database.getCollection("test");
        // Create a document to store
        Document doc = new Document("name", "Thinzar Phyo Wai")
                .append("class", "DevOps")
                .append("year", "2025")
                .append("result", new Document("Coursework marks", 95).append("Exam marks", 85));
        // Add document to collection
        collection.insertOne(doc);

        // Check document in collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());

    }
}