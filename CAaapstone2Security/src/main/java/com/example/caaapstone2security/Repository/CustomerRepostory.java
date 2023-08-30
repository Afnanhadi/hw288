package com.example.caaapstone2security.Repository;

import com.example.caaapstone2security.Model.Customer;
import com.example.caaapstone2security.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepostory extends JpaRepository<Customer,Integer> {
    Customer findUserById (Integer Id);

    //List<Customer> findUserBy (String name);
    List<Customer> findUserByPoints (Double points);
    ///boolean existsByEmailAndPassword(String password,String email);

    List<Customer> findAllByUser(User user);
    Customer findAllByPoints (Double points );
    //  @Query("select c from User c where c.points>=?1")
    // User findUserByPointsGreaterThanEqual (Double ProductsPrice);

}