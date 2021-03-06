package groceryapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import groceryapp.models.ShoppingList;

@RestController
public class ShoppingListController {
	private ShoppingService service = new ShoppingService();

	@RequestMapping("/shoppinglists")
	public List<ShoppingList> getShoppingLists() {
		return this.service.getItems();
	}

	@RequestMapping("/shoppinglists/{title}")
	public ShoppingList getShoppingList(@PathVariable String title) {
		return this.service.getItem(title);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/shoppinglists/")
	public ShoppingList addShoppingList(@RequestBody ShoppingList shoppingList) {
		return shoppingList;
	}

	@RequestMapping("/")
	public String hello() {
		return "Welcome To Spring Boot World";
	}
}
