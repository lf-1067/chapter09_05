package com.j2ee.test;


import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoBean implements PersonDao {
    public void save(PersonDao personDao){
        personDao.save(personDao);
    }
}
