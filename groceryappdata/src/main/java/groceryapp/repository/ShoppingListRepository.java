package groceryapp.repository;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
public interface ShoppingListRepository extends CrudRepository<ShoppingList, int> {
	
}
