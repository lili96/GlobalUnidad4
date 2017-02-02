package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Location;;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
