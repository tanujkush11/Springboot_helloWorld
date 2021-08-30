package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fruits.Fruits;


public interface Reposi extends JpaRepository<Fruits, Long>{

	
}
