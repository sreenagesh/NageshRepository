package groceryapp.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import groceryapp.models.ShoppingList;
@Repository
public interface ShoppingListRepository extends CrudRepository<ShoppingList, Integer > {
	
	
}
/*
public interface ShoppingListRepository extends JpaRepository<ShoppingList, Integer > , JpaSpecificationExecutor<ShoppingList>{
	
	
}
*/