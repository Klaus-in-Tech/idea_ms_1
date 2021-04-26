package com.flyhub.ideamanagementsystem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.flyhub.ideamanagementsystem.entity.User;
import com.flyhub.ideamanagementsystem.repository.UserRepository;

@DataJpaTest
@Rollback(false)
public class UserRepositoryTests {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("klaus@gmail.com");
		user.setPassword("Klaus");
		user.setFirst_Name("Kakooza");
		user.setLast_Name("Allan");
		
		User savedUser = repo.save(user);
		
		User exitUser = entityManager.find(User.class, savedUser.getId());
		
		assertThat(exitUser.getEmail()).isEqualTo(user.getEmail());
		
	}

}
