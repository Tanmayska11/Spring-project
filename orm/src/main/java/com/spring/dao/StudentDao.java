package com.spring.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate gettemplate() {
		return hibernateTemplate;
	}

	public void settemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}

	public StudentDao(HibernateTemplate template) {
		super();
		this.hibernateTemplate = template;
	}
	
	//save student
	@Transactional
	public int insert(Student student) {
		int row=(int) hibernateTemplate.save(student);
		return row;
	}

}
