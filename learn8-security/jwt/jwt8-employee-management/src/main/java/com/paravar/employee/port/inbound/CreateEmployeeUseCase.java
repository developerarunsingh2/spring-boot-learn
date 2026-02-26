package com.paravar.employee.port.inbound;

import com.paravar.domain.Employee;
import com.paravar.employee.model.CreateEmployee;

public interface CreateEmployeeUseCase {
    // Todo: @PreAuthorize("access.caneCreateEmployee(createEmployee)") // check current user role & validate payload
    Employee createEmployee(CreateEmployee createEmployee);
}
