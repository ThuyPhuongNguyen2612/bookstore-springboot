package com.practice.bookstore;

import com.practice.bookstore.repository.UserRepository;
import com.practice.bookstore.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookStoreApplicationTests {

	@MockBean
	UserRepository userRepository;

	@Autowired
	private UserService userService;

	@Test
	void testCountUsers() {
		Assert.assertEquals(16, userRepository.findAll().size());
	}

}
