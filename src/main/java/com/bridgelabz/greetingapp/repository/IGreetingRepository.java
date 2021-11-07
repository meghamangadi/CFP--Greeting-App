package com.bridgelabz.greetingapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.greetingapp.entity.GreetingEntity;

@Repository
public interface IGreetingRepository extends CrudRepository<GreetingEntity,Long>  {

}
