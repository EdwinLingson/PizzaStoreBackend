package com.edwin.angSpring.pizzastore.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.angSpring.pizzastore.model.users.Manager;
import com.edwin.angSpring.pizzastore.model.view.UserAuth;
import com.edwin.angSpring.pizzastore.repository.users.ManagerDAO;

import jakarta.transaction.Transactional;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerDAO managerDAO;
	
	@Override
	public Manager getManagerbyUsername(String uname) {
		Manager mgr = managerDAO.getManagerByUname(uname);
		return mgr;
	}

	@Override
	public UserAuth authenticate(Manager mgr) {
		UserAuth retObj = new UserAuth();
		Manager realMgr = getManagerbyUsername(mgr.getUname());
		if(realMgr==null)return retObj;
		retObj.setId(realMgr.getId());
		retObj.setSuccess(realMgr.authenticate(mgr.getUname(), mgr.getPwd()));
		return retObj;
	}

	@Override
	@Transactional
	public Manager createManager(Manager mgr) {
		return managerDAO.createUser(mgr);
	}

	@Override
	public Manager editManager(Manager mgr) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void promote(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demote(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean possibleuserName(String uname) {
		return managerDAO.getUsernameAvail(uname);
	}

	@Override
	public void deleteManager(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Manager getManagerDetails(long id) {
		return  (Manager) managerDAO.getUser(id);
	}

}
