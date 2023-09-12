package com.edwin.angSpring.pizzastore.repository.users;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edwin.angSpring.pizzastore.model.users.Customer;
import com.edwin.angSpring.pizzastore.model.users.Person;

import jakarta.persistence.EntityManager;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Customer createUser(Customer csr) {
		Session currSession =entityManager.unwrap(Session.class);
		long id = (long) currSession.save(csr);
		return currSession.get(Customer.class,id);
	}

	@Override
	public Customer getUser(long id) {
		Session currSession =entityManager.unwrap(Session.class);
		System.out.println(id);
		return currSession.get(Customer.class,id);
	}

	@Override
	public Person deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateBalance(long id, double amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomerByUname(String uname) {
		Session currSession =entityManager.unwrap(Session.class);
		Query <Customer> query = currSession.createQuery("from Customer u where u.uname ="
				+ " :uname",Customer.class);
		query.setParameter("uname",uname);
		List<Customer> list = query.getResultList();
		if(list.size()>0)
		return list.get(0);
		return null;
	}

	@Override
	public boolean getUsernameAvail(String uname) {
		System.out.println(uname);
		Session currSession =entityManager.unwrap(Session.class);
		Query <Customer> query = currSession.createQuery("from Customer u where u.uname ="
				+ " :uname",Customer.class);
		query.setParameter("uname",uname);
		List<Customer> list = query.getResultList();
		if(list.size()>0)
		return false;
		return true;
	}

	@Override
	public Customer updateUser(Customer csr) {
		System.out.println(csr.getId());
		Customer dbCsr = getUser(csr.getId());
		System.out.println(csr.getWalletBalance());
		dbCsr.setWalletBalance(csr.getWalletBalance());
		return dbCsr;
	}

}
