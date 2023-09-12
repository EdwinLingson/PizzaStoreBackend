package com.edwin.angSpring.pizzastore.repository.users;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edwin.angSpring.pizzastore.model.users.Manager;
import com.edwin.angSpring.pizzastore.model.users.Person;

import jakarta.persistence.EntityManager;

@Repository
public class ManangerDAOImpl implements ManagerDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Manager getUser(long id) {
		Session currSession =entityManager.unwrap(Session.class);
		System.out.println(id);
		return currSession.get(Manager.class,id);
	}

	@Override
	public Person deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager createUser(Manager mgr) {
		Session currSession =entityManager.unwrap(Session.class);
		long id = (long) currSession.save(mgr);
		return currSession.get(Manager.class,id);
	}

	@Override
	public Manager updateUser(Manager csr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBalance(long id, double amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Manager getManagerByUname(String uname) {
		Session currSession =entityManager.unwrap(Session.class);
		Query <Manager> query = currSession.createQuery("from Manager u where u.uname ="
				+ " :uname",Manager.class);
		query.setParameter("uname",uname);
		List<Manager> list = query.getResultList();
		if(list.size()>0)
		return list.get(0);
		return null;
	}

	@Override
	public boolean getUsernameAvail(String uname) {
		System.out.println(uname);
		Session currSession =entityManager.unwrap(Session.class);
		Query <Manager> query = currSession.createQuery("from Manager u where u.uname ="
				+ " :uname",Manager.class);
		query.setParameter("uname",uname);
		List<Manager> list = query.getResultList();
		if(list.size()>0)
		return false;
		return true;
	}

}
