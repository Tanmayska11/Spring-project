package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("ormconfig.xml");
        StudentDao stdDao= context.getBean("studentDao",StudentDao.class);
        
        Student s1 = new Student();
        s1.setStudentId(125);
        s1.setStudentName("Tanmay");
        s1.setStudentCity("Nashik");
        
        int row=stdDao.insert(s1);
        System.out.println(row+"inserted in table......");
    }
}

