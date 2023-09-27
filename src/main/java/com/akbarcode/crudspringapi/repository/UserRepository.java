/**
 * 
 */
package com.akbarcode.crudspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akbarcode.crudspringapi.entity.User;

/**
 * @author
 *  Akbar Pambudi Utomo Sep 27, 2023 1:07:00 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
