package netgloo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import netgloo.models.Employee;
import netgloo.models.Friendships;
import netgloo.models.Restaurant;
import netgloo.models.SystemManager;
import netgloo.models.User;

public interface EmployeeDao  extends CrudRepository<Employee, Long>{

	//public List<Friendships> findByLoveGiver(User love_giver);
	
	public Employee findByUserId(User user);
	
	public ArrayList<Employee> findByRestaurantId(Restaurant restaurant);
	
}
