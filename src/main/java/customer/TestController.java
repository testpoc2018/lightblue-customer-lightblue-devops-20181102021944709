package customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {	
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/test2")
	public ResponseEntity<?> getTestValue(){
		logger.info("Inside the Test Value 2");		
		return ResponseEntity.ok("Test 2");
	}

}