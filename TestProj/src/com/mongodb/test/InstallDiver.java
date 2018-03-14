package com.mongodb.test;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.DBCollectionCountOptions;

public class InstallDiver {


		
		
		public static void main( String args[] ) {  
		      
			
			
			try {
			
			MongoClient  mongoclient = new MongoClient("localhost",27017);
			
			 
			  System.out.println("sewrver connected successfully");
			  MongoDatabase dbs=mongoclient.getDatabase("mytestdb");
			  System.out.println("connected to database successfully");
			  System.out.println("bdname is:"+dbs.getName());
			  
			  List<String> alldb=mongoclient.getDatabaseNames();
			  System.out.println(alldb);
			  
			  DB dbse=mongoclient.getDB("mytestdb");
			  
			  DBCollection collection=dbse.getCollection("customers");
			  
			  System.out.println(collection);
			  //insert data
			  //BasicDBObject doc1=new BasicDBObject("name","rupera").append("age",25);
			  
			  //collection.insert(doc1);
			  
			//Retrive data
			  
			  Cursor cursor=collection.find();
			  
			  while(cursor.hasNext())
			  {
				  System.out.println(cursor.next().get("firstname"));
				  
			  }
			  
			  //update data
			  
			 // BasicDBObject oldupdatedoc=new BasicDBObject().append("$set", new BasicDBObject().append("firstname","ravi"));
			  
			  
			 // BasicDBObject newupdatedoc=new BasicDBObject().append("gender","female");
			 // collection.update(oldupdatedoc, newupdatedoc);
              //  cursor=collection.find();
			  
			//  while(cursor.hasNext())
			//  {
				//  System.out.println(cursor.next());
				  
			//  }
			  
			  
			  //delete
			  BasicDBObject del=new BasicDBObject().append("name","killer");
			  collection.remove(del);
			  cursor=collection.find();
			  while(cursor.hasNext())
			  {
				  System.out.println(cursor.next());
				  
			  }
			  
			} catch (Exception e) {
			
			  e.printStackTrace();
			
			
			
		
		/*DB db=new MongoClient("localhost", 27017).getDB("sumantadatabase");
		DBCollection dbcollection=db.getCollection("chanel");
		BasicDBObject basicdbobject=new BasicDBObject();
		basicdbobject.put("name","saassasa");
		dbdbcollection.in
		System.out.println("connected");*/

	}
		}
}
