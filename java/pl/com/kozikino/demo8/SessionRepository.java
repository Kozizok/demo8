package pl.com.kozikino.demo8;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository <Session, Integer> {
}
