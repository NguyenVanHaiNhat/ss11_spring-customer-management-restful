package org.example.springcustomermanagementrestful.repository;

import org.example.springcustomermanagementrestful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
