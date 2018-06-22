package com.cgi.uswest.chimpls.address;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/address") 

public class AddressController {
	@Autowired
	private AddressRepository addressRepository;
	
	@RequestMapping("/all")
	public @ResponseBody Iterable<Address> getAllAddreses() {
		// This returns a JSON or XML with the users
		return addressRepository.findAll();
	}
	
	@RequestMapping("/caseAddress/{id_case}")
	public @ResponseBody Address getCaseAddress(@PathVariable("id_case") BigDecimal id_case) {
		return addressRepository.getCaseAddress(id_case);
    }
	
	@RequestMapping("/personAddress/{id_prsn}")
	public @ResponseBody Address getPersonAddress(@PathVariable("id_prsn") BigDecimal id_prsn) {
		return addressRepository.getPersonAddress(id_prsn);
    }
	
	@RequestMapping("/providerAddress/{id_prvd}")
	public @ResponseBody Address getProviderAddress(@PathVariable("id_prvd") BigDecimal id_prvd) {
		return addressRepository.getProviderAddress(id_prvd);
    }
}
