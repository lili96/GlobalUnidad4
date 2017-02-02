package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Item;


public interface ItemRepository extends CrudRepository<Item, Integer>{

}
