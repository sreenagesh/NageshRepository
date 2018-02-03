package groceryapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingList {
	@Id
	private int id;
	private String title;
	public ShoppingList() {}
	public ShoppingList(int id,String title) {
		this.title=title;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
