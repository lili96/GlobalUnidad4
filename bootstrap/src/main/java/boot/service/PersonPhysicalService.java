package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.LocationRepository;
import boot.dao.PersonPhysicalRepository;
import boot.model.PersonPhysical;


@Service
@Transactional
public class PersonPhysicalService {
	private final PersonPhysicalRepository personPhysicalRepository;

	public PersonPhysicalService(PersonPhysicalRepository personPhysicalRepository) {
		super();
		this.personPhysicalRepository = personPhysicalRepository;
	}

	public List<PersonPhysical> findAll() {
		List<PersonPhysical> personPhysicals = new ArrayList<PersonPhysical>();
		for (PersonPhysical personPhysical : personPhysicalRepository.findAll()) {
			personPhysicals.add(personPhysical);
		}
		return personPhysicals;
	}
	public void save(PersonPhysical personPhysical){
		personPhysicalRepository.save(personPhysical);
	}
	public void delete(int id){
		personPhysicalRepository.delete(id);
	}
	public PersonPhysical findPersonPhysical(int id){
		return personPhysicalRepository.findOne(id);
	}

}
