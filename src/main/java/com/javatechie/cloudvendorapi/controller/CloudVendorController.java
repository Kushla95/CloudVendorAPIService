package com.javatechie.cloudvendorapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	  
		/*
		 * @PutMapping("/{vendorId}") public CloudVendor updateVendor(@PathVariable
		 * String vendorId, @RequestBody CloudVendor cloudVendor) { // Implement logic
		 * to update an existing vendor return your logic to update a vendor ; }
		 * 
		 * @DeleteMapping("/{vendorId}") public void deleteVendor(@PathVariable String
		 * vendorId) { // Implement logic to delete an existing vendor // For example,
		 * you can use a service to delete data from a database }
		 */
	 
}
