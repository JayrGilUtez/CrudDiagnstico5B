package services.Impl;

import models.dao.DaoPerson;
import models.dto.PersonDto;
import models.entity.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.IPerson;

import java.util.List;

@Service
public class PersonImpl implements IPerson {
    @Autowired
    DaoPerson daoPerson;

    @Override
    @Transactional
    public PersonBean save(PersonDto person) {
        PersonBean personBean = PersonBean.builder()
                .id(person.getId())
                .name(person.getName())
                .birthdate(person.getBirthdate())
                .curp(person.getCurp())
                .build();
        return daoPerson.save(personBean);
    }

    @Override
    @Transactional(readOnly = true)
    public PersonBean findById(Integer id) {
        return daoPerson.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonBean> findAll() {
        return (List<PersonBean>) daoPerson.findAll();
    }

    @Override
    @Transactional
    public void delete(PersonBean person) {
        daoPerson.delete(person);

    }
}
