package autowiring.sterotype.repository;

import javax.inject.Named;

import org.springframework.stereotype.Repository;

import autowiring.sterotype.domain.Employee;

//@Repository
@Named
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public void save(Employee employee) {
		System.out.println("EmployeeRepositoryImpl");
	}

}
