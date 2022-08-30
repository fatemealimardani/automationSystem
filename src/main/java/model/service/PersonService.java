package model.service;

import connection.SessionFactorySingleton;
import model.entity.Person;
import model.repository.PersonRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonService {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    private final PersonRepository personRepository = new PersonRepository();

    public Person findById(Integer id) {
        try(var session = sessionFactory.getCurrentSession()) {
            session.getTransaction().begin();
            try {
                return personRepository.findById(id);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }

    public List<Person> findAll() {
        try (var session = sessionFactory.getCurrentSession()) {
            session.getTransaction().begin();
            try {
                return personRepository.findAll();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }
}
