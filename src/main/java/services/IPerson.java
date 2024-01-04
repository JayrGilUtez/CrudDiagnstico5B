package services;

import models.dto.PersonDto;
import models.entity.PersonBean;

import java.util.List;

public interface IPerson {

    PersonBean save(PersonDto person);
    PersonBean findById(Integer id);
    List<PersonBean> findAll();
    void delete(PersonBean person);


}
