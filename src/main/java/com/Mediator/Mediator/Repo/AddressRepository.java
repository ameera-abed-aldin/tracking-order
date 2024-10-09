package com.Mediator.Mediator.Repo;


import com.Mediator.Mediator.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
