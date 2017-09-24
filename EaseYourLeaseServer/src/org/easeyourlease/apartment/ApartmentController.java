package org.easeyourlease.apartment;

import java.util.ArrayList;
import org.easeyourlease.apartment.Apartment;
import org.easeyourlease.constants.URIConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApartmentController {
	
	@ResponseBody
	@RequestMapping(value=URIConstants.APARTMENT_LIST, method=RequestMethod.GET)
	public ArrayList<Apartment> getApartmentList(){
		Apartment apt1 = new Apartment();
		apt1.setApartmentDetails("001","Apartment1","1BHK");
		Apartment apt2 = new Apartment();
		apt2.setApartmentDetails("002","Apartment2","2BHK");
		Apartment apt3 = new Apartment();
		apt3.setApartmentDetails("003","Apartment3","3BHK");
		Apartment apt4 = new Apartment();
		apt4.setApartmentDetails("004","Apartment4","1BHK");
		
		ArrayList<Apartment> apartmentList= new ArrayList<Apartment>();
		apartmentList.add(apt1);
		apartmentList.add(apt2);
		apartmentList.add(apt3);
		apartmentList.add(apt4);
		
		return apartmentList;
		
	}

}
