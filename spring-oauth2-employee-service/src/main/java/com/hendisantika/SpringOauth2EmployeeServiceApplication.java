package com.hendisantika;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringOauth2EmployeeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2EmployeeServiceApplication.class, args);
    }

    @Service
    @RequiredArgsConstructor
    public static class EmployeeService {

        private final DepartmentRestClient departmentRestClient;

        public String getEmployeeAndDepartment() {
            String employeeName = "Arun";
            String departmentName = departmentRestClient.getDepartmentName();

            return "Employee Service Returned: " + employeeName + ", \nDepartment Service Returned: " + departmentName;
        }
    }

}
