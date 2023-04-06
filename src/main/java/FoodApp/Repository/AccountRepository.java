package FoodApp.Repository;

import FoodApp.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long>{
  @Query("FROM Account WHERE username = :username")
  Optional<Account> getUserByName(@Param("username") String username);
  //@Query("FROM users WHERE name= :name")
  //List<Account> findAccountByUserName(String userName);


}


