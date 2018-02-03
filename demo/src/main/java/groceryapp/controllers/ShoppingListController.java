package groceryapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import groceryapp.models.ShoppingList;
import groceryapp.services.ShoppingService;

@RestController
public class ShoppingListController {
	private ShoppingService service = new ShoppingService();

	@RequestMapping("/save")
	public String process(){
		if(this.service.save()) {
			return "Successfully Saved All";
		}
		
		return "Something failed";
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/shoppinglists")
	public List<ShoppingList> getShoppingLists() {
		return this.service.getItems();
	}

	@RequestMapping("/shoppinglists/{id}")
	public ShoppingList getShoppingList(@PathVariable int id) {
		return this.service.getItemById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/shoppinglists")
	public ShoppingList addShoppingList(@RequestBody ShoppingList shoppingList) {
		return this.service.addItem(shoppingList);
	}

	@RequestMapping("/")
	public String hello() {
		return "Welcome To Spring Boot World";
	}
}
