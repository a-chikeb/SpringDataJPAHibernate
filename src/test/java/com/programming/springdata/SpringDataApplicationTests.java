package com.programming.springdata;

import com.programming.springdata.models.Users;
import com.programming.springdata.repositories.UserRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SpringDataApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void checkDatabase() {
        Users user = new Users("testing","test@gmail.com","password");
        Users u = userRepository.save(user);
        assertThat(user).usingRecursiveComparison().ignoringFields("id").isEqualTo(u);
        //delete
        userRepository.delete(u);
        System.out.println("Database Work");

    }

}
