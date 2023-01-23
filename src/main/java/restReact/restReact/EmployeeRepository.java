package restReact.restReact;

import org.springframework.data.repository.CrudRepository;


//Defining the Repository
//Another key piece of a Spring Data REST application is a
// corresponding repository definition, as follows:
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    //The repository extends Spring Data Commons' CrudRepository
    // and plugs in the type of the domain object and its primary key

    //That is all that is needed! In fact, you need not even annotate interface if it is top-level and visible.
    // If you use your IDE and open up CrudRepository, you will find a collection of pre-defined methods.


}

