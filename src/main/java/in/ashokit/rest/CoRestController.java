package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CoResponse;
import in.ashokit.service.CoService;

@RestController
public class CoRestController {

	@Autowired
	private CoService service;

	@GetMapping("/process")
	public CoResponse processTriggers() throws Exception{
		return service.processPendingTriggers();
	}
}
