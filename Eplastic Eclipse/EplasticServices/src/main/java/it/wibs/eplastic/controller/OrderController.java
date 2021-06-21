package it.wibs.eplastic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.wibs.eplastic.bindcommerceIntegration.api.obj.documents.Documents;
import it.wibs.eplastic.bindcommerceIntegration.api.obj.documents.DocumentsResponse;
import it.wibs.eplastic.services.OrderServices;

@RestController
@RequestMapping("/eplastic" )
public class OrderController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderServices orderService;
	
	@GetMapping("/getlocalorderslist")
	public ResponseEntity getOrdersListFromLocal() throws Exception{
		DocumentsResponse resp = null;
		String error = null;
		try {
			resp = orderService.getOrderFromFileXml();
			
			if(resp.getDocuments()!= null) {
				return  new ResponseEntity( resp , HttpStatus.OK);
			}else {
				return  new ResponseEntity( resp.getErrorCode() + "/n " +resp.getErrorDescription() , HttpStatus.BAD_REQUEST);
			}
			
		}catch(Exception e) {
			resp= new DocumentsResponse();
			resp.setErrorCode(e.getMessage());
			resp.setErrorDescription(e.getStackTrace().toString());
			LOGGER.error("error getting orders from orderService.getOrderFromFileXml()");
		}
		return new ResponseEntity<DocumentsResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/getorderslist")
	public ResponseEntity getOrdersListFromUrl() throws Exception{
		DocumentsResponse orders = new DocumentsResponse();
		DocumentsResponse resp = null;
		String error = null;
		try {
			if(orderService.callOrderList()!= null) {
				resp = orderService.callOrderList();
			}
			
			if(resp != null) {
				
				return  new ResponseEntity( orders.getDocuments().size() + " Orders founded!! " , HttpStatus.OK);
			}else {
				return  new ResponseEntity(resp, HttpStatus.BAD_REQUEST );
			}
			
		}catch(Exception e) {
			error = e.getMessage() ;
			LOGGER.error("error getting orders from orderService.callOrderList():"+ e.getMessage());
		}
		return new ResponseEntity<DocumentsResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	
}
