package in.co.srdt.BeHappy.repository;

import in.co.srdt.BeHappy.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
