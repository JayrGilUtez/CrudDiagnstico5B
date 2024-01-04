package models.dao;

import models.entity.PersonBean;
import org.springframework.data.repository.CrudRepository;

public interface DaoPerson extends CrudRepository<PersonBean, Integer> {

}
