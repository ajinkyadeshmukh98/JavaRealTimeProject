package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ad.entity.Tourist;
import com.ad.service.ITouristManagementService;


@RestController
@RequestMapping("/tourist-api")
public class Touristoperations {
     @Autowired
	private ITouristManagementService service;
     
    @PostMapping("/register")
   public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
   	 try {
			String ResultMsg=service.registerTourist(tourist);
			return new ResponseEntity<String>(ResultMsg, HttpStatus.CREATED);
   		  		 
  		 
	      } catch (Exception e) {
		return new ResponseEntity<String>("Error while enrolling tourist", HttpStatus.INTERNAL_SERVER_ERROR);
	}   
   	 }
    

  	 
   	 @GetMapping("/findall")
    	 public ResponseEntity<?> displayTourists(){
    		 try {
   			 List<Tourist>list=service.fetchAllTourists();
    			 return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
    			 
    			 
				
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<String>("Error in fetching tourist details", HttpStatus.INTERNAL_SERVER_ERROR);
			}
   	 }
   	 
   	 @GetMapping("/find/{id}")
   	 public ResponseEntity<?>displayTouristById(@PathVariable("id")Integer id){
   		 try {
   			 Tourist tourist=service.fetchTouristById(id);
   			 return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
   			 
   			 
   			 
   			 
			
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
   	 }
   	 
   	 
   	 
   	 
}

     
     
	

