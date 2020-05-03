package autowiring.sterotype.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import autowiring.sterotype.domain.Employee;
import autowiring.sterotype.repository.EmployeeRepository;
//@Service

@Named
public class EmployeeServiceImpl implements EmployeeService {

	//@Autowired
	@Inject
	private EmployeeRepository empRepository;
	@Override
	public void save(Employee employee) {
		//validation yapılır .
		empRepository.save(employee);
	}

}
