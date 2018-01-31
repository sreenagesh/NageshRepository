package groceryapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import groceryapp.models.ShoppingList;

@Service
public class ShoppingService {
	private List<ShoppingList> list = new ArrayList<ShoppingList>(Arrays.asList(new ShoppingList(1, "Nagesh Organics"),
			new ShoppingList(2, "Krishna Cars"), new ShoppingList(3, "Sujana HomeDecor")));

	public ShoppingService() {
	}
	
	public List<ShoppingList> getItems(){
		return list;
	}
	
	public ShoppingList getItemById(int id) {
		for(ShoppingList item:list) {
			if(item.getId()== id) {
				return item;
			}
		}
		return new ShoppingList();
	}
	
	public ShoppingList addItem(ShoppingList item) {
		boolean done = list.add(item);
		if(done) {
			return item;
		}
		return null;
	}

}
