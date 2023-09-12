package com.edwin.angSpring.pizzastore.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.angSpring.pizzastore.model.users.Customer;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;
import com.edwin.angSpring.pizzastore.repository.users.CustomerDAO;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public Customer getCustomerbyUsername(String uname) {
		// TODO Auto-generated method stub
		Customer csr = customerDAO.getCustomerByUname(uname);
		
		return csr;
	}

	@Override
	public UserAuth authenticate(Customer csr) {
		// TODO Auto-generated method stub
		UserAuth retObj = new UserAuth();
		Customer realCsr = getCustomerbyUsername(csr.getUname());
		if(realCsr==null)return retObj;
		
		retObj.setId(realCsr.getId());
		retObj.setSuccess(realCsr.authenticate(csr.getUname(), csr.getPwd()));
		return retObj;
				
	}

	@Override
	public boolean possibleuserName(String uname) {
		// TODO Auto-generated method stub
		return customerDAO.getUsernameAvail(uname);
	}
	
	@Transactional
	@Override
	public Customer createCustomer(Customer csr) {
		return (Customer) customerDAO.createUser(csr);
	}

	@Transactional
	@Override
	public Customer editCustomer(Customer csr) {
		return (Customer) customerDAO.updateUser(csr);
	}

	@Override
	public void deleteteCustomer(long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	@Override
	public Customer addBalance(Customer csr) {
		System.out.println(csr.getWalletBalance());
		return customerDAO.updateUser(csr);
		
	}

	@Override
	public Customer getCustomerDetails(long id) {
		System.out.println(id);
		return (Customer) customerDAO.getUser(id);
	}

}
