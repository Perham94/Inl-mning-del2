package inlamning.del2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import hello.wsdl.FullCountryInfo;
import hello.wsdl.FullCountryInfoResponse;


public class Del_C extends  WebServiceGatewaySupport {

	// Url samt loggar allt retunerar om det skulle bli fel
	private String url = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL";
	private static Logger log = LoggerFactory.getLogger(Del_C.class);
	
	
	

	//Får ut response svar webbservisen som använder sig av Hello.wsd klassarna
	public FullCountryInfoResponse  getCountryFull(String country) {
		FullCountryInfo request = new FullCountryInfo() ;
	    	
	    	request.setSCountryISOCode(country); 
	    	log.info("Requesting location for " + country);
	    	FullCountryInfoResponse response =  (FullCountryInfoResponse )getWebServiceTemplate()
	    			.marshalSendAndReceive
	    			(url, request,
							new SoapActionCallback(
									url));
	    	
	    	return response;
			
		}
	
	
    
}
