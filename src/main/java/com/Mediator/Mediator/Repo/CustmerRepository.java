package com.Mediator.Mediator.Repo;

import com.Mediator.Mediator.Entity.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustmerRepository extends JpaRepository<Custmer,Integer>  {

}
