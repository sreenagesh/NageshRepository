package groceryapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groceryapp.models.ShoppingList;
import groceryapp.repository.ShoppingListRepository;

@Service
public class ShoppingService {

	@Autowired(required=true)
	private ShoppingListRepository repo;

	private List<ShoppingList> list = new ArrayList<ShoppingList>(Arrays.asList(new ShoppingList(1, "Nagesh Organics"),
			new ShoppingList(2, "Krishna Cars"), new ShoppingList(3, "Sujana HomeDecor")));

	public ShoppingService() {
	}

	public List<ShoppingList> getItems() {
		List<ShoppingList> sList = new ArrayList<ShoppingList>();
		// repo.findAll().forEach(sList::add);
		Iterable<ShoppingList> itr = repo.findAll();
		if (itr != null) {
			itr.forEach(sList::add);
		}
		return sList;
	}

	public ShoppingList getItemById(int id) {
		for (ShoppingList item : list) {
			if (item.getId() == id) {
				return item;
			}
		}
		return new ShoppingList();
	}

	public ShoppingList addItem(ShoppingList item) {
		// boolean done = list.add(item);
		return repo.save(item);
	}

	public boolean save() {
		// save a single Customer

		try {
		repo.save(list);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

}
