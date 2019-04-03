package com.tse.practico.ejb;

import static javax.ejb.ConcurrencyManagementType.CONTAINER;

import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class NewsData
 */
@Singleton
@ConcurrencyManagement(CONTAINER)
public class NewsData {

    private int numberOfSessions;
    /**
      * Initialize the Bean
      */
      @PostConstruct
      public void init(){
          // Initialize bean here
          System.out.println("Initializing bean...");
      }
      
     // Resets the counter on application startup
     public NewsData(){
         numberOfSessions = 0;
     }
     
     /**
      * @return the numberOfSessions
      */
     public int getNumberOfSessions() {
         numberOfSessions++;
         return numberOfSessions;
     }
     
     /**
      *  @param numberOfSessions the numberOfSessions to set.  This could be set
 *  from the database if the current counter were persisted before the application
 *  was shutdown
      */
     public void setNumberOfSessions(int numberOfSessions) {
         this.numberOfSessions = numberOfSessions;
     }

}
