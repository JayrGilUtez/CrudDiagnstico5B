package controllers;

import models.dto.PersonDto;
import models.entity.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.Impl.PersonImpl;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    @Autowired
    PersonImpl personService;

    @GetMapping("/{id}")
    public PersonBean findById(@PathVariable Integer id){
        return null;
    }

    @GetMapping("/")
    public List<PersonBean> findAll(){
        return null;
    }

    @PostMapping("/")
    public PersonDto create(@RequestBody PersonDto personDto){
        PersonBean person = personService.save(personDto);
        return PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .birthdate(person.getBirthdate())
                .curp(person.getCurp())
                .build();
    }

    @PutMapping("/")
    public PersonDto update(@RequestBody PersonDto personDto){
        PersonBean person = personService.save(personDto);
        return PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .birthdate(person.getBirthdate())
                .curp(person.getCurp())
                .build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        PersonBean person = personService.findById(id);
        personService.delete(person);
    }

}
