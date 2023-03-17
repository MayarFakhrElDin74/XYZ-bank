package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	
	
	public String depositamount , withdrawlamount , customerfn , customerln , postalcode ;

	
	public void jsonReader () throws FileNotFoundException, IOException, ParseException
	
	{
		
		String filePath = System.getProperty("user.dir")+ "\\src\\test\\java\\data\\UserData.json" ;
		File srcfile = new File(filePath) ;
		
		JSONParser parser = new JSONParser() ;
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcfile)) ;
		
		for (Object jsonObject : jArray) {
			
			JSONObject person = (JSONObject) jsonObject ;
			
			depositamount = (String)person.get("depositamount") ;
			System.out.println(depositamount);
			
			withdrawlamount = (String)person.get("withdrawlamount") ;
			System.out.println(withdrawlamount);
			
			customerfn = (String)person.get("customerfn") ;
			System.out.println(customerfn);
			
			customerln = (String)person.get("customerln") ;
			System.out.println(customerln);
			
			postalcode = (String)person.get("postalcode") ;
			System.out.println(postalcode);
			
			
		}
		
	}
}
