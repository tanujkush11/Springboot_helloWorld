package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Fruits.Fruits;
import repo.Reposi;

@RestController
@RequestMapping("/fruits")
public class RestCont {
	@Autowired
	private Reposi reposi;
	@GetMapping("/getFruits")
	public List<Fruits> getAllFruits(){
		return reposi.findAll();
	}
	@PostMapping("/add")
	public Fruits createFruits(@Validated @RequestBody Fruits fruit) {
		return reposi.save(fruit);
	}

}
