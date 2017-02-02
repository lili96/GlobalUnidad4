package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.ItemRepository;
import boot.dao.LocationRepository;
import boot.model.Item;
import boot.model.Location;

@Service
@Transactional
public class ItemService {
	private final ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	public List<Item> findAll() {
		List<Item> items = new ArrayList<Item>();
		for (Item item : itemRepository.findAll()) {
			items.add(item);
		}
		return items;
	}
	public void save(Item item){
		itemRepository.save(item);
	}
	public void delete(int id){
		itemRepository.delete(id);
	}
	public Item findItem(int id){
		return itemRepository.findOne(id);
	}
}
