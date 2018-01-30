package groceryapp.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import groceryapp.models.ShoppingList;

@Service
public class ShoppingService {
	private List<ShoppingList> list = Arrays.asList(new ShoppingList("Nagesh Organics"),
			new ShoppingList("Krishna Cars"), new ShoppingList("Sujana HomeDecor"));

	public ShoppingService() {
	}
	
	public List<ShoppingList> getItems(){
		return list;
	}
	
	public ShoppingList getItem(String title) {
		for(ShoppingList item:list) {
			if(item.getTitle().equals(title)) {
				return item;
			}
		}
		return new ShoppingList();
	}

}
