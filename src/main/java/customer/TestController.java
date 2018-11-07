package customer;



@RestController
public class TestController {	
	
	@RequestMapping(method = RequestMethod.GET, value = "/test2", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<?> getTestValue(){
		logger.info("Inside the Test Value 2");		
		return ResponseEntity.ok("Test 2");
	}

}