package com.j2ee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service("personService")
public class PersonServiceBean implements PersonService {

    public String addPerson(String str) {
        System.out.println("addPerson()执行了...");
        return str;
    }

    private PersonDao personDao;
    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonServiceBean personServiceBean= (PersonServiceBean) applicationContext.getBean("personService");
        String str= personServiceBean.addPerson("1122");
        System.out.println(str);
    }

}