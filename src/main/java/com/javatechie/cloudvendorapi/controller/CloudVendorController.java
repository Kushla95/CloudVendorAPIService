package com.javatechie.cloudvendorapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.cloudvendorapi.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getVendorById(@PathVariable String vendorId) {

		return cloudVendor;
		// new CloudVendor("C1","Vendor 1","Address One","xxxxx");
	}

	
	  @PostMapping 
	  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	  {
		  this.cloudVendor=cloudVendor;
		  return "Cloud Vendor Created Successfully"; 
		  
	  }

	 @PutMapping
	  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
		  this.cloudVendor=cloudVendor;
		  return "Cloud Vendor Updated Successfully";
	  }
	 
	 @DeleteMapping("{vendorId}")
	 public String deleteCloudVendorDetaisl(String cloudVendor) {
		 this.cloudVendor=null;
		 return "Cloud Vendor deleted successfully";
	 }
	  
	
}
