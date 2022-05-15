package pl.com.kozikino.demo8;


import org.springframework.data.repository.CrudRepository;

import pl.com.kozikino.demo8.Movies;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}