package netgloo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import netgloo.dao.EmployeeDao;
import netgloo.dao.UserDao;
import netgloo.models.Employee;
import netgloo.models.SystemManager;
import netgloo.models.User;
import netgloo.models.UserProba;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	
	//NA ZALOST ... EMPLOYEE CE KORISTITI SVOJ EMPLOYEE NICK ALI CE ISTO TAKO KORISTITI STARI USER PASSWORD
	
	@Autowired
	private EmployeeDao empDao;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/loginEmployee", method = RequestMethod.POST, headers = { "content-type=application/json" })
	public String loginEmployee(@RequestBody UserProba user1, HttpServletRequest request) {

		try {
			User user = userDao.findByEmail(user1.getEmail());
			String email = String.valueOf(user.getEmail());
			String pass = String.valueOf(user.getUser_password());
			if (email.equals(user1.getEmail()) && pass.equals(user1.getPassword())) {
				request.getSession().setAttribute("user", user);
				
				
				System.out.println(user.getUserId());
				System.out.println("------------ISPIS ---------------------");
				Employee employee = empDao.findByUserId(user);
				
				if(employee!=null)
				{
					System.out.println("KONF BR: "+employee.getEmployee_confection_number());
					request.getSession().setAttribute("employee", employee);
				}
				return user.getUser_role();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return "EXCEPTION";
		}
		return "OK";
	}
	
	@RequestMapping(value = "/logoutEmployee", method = RequestMethod.GET)
	public String loginEmployee(HttpServletRequest request) {

		try {
			request.getSession().invalidate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "logout";
	}
	
	/*
	@RequestMapping(value = "/loginEmployee", method = RequestMethod.POST, headers = { "content-type=application/json" })
	public String loginEmployee(@RequestBody Employee emp, HttpServletRequest request) {
		try {
			//SystemManager systemManager = sysMaDao.findBySystem_manager_nick_id(sm1.getSystem_manager_nick_id());
			Employee employee = empDao.findOne(emp.getEmployee_id());
			//System.out.println(systemManager.getSystem_manager_nick_id());
			if(employee!=null)
			{
				String empNick = String.valueOf(employee.getEmployee_id());
				String usrPass = String.valueOf(employee.getUser_id().getUser_password());
				if (nick.equals(sm1.getSystem_manager_nick_id()) && pass.equals(sm1.getManager_password())) {
					request.getSession().setAttribute("systemManager", systemManager);
					//System.out.println("LOGIN SYSTEM MANAGERA JE USPJESAN!");
					return "systemManager";
				}
			}	
		} catch (Exception ex) {
			ex.printStackTrace();
			return "EXCEPTION";
		}
		return "OK";
	}
	*/

}
