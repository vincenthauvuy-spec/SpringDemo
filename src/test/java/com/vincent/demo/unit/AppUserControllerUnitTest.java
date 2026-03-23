package com.vincent.demo.unit;

import com.vincent.demo.MockAppUserDao;
import com.vincent.demo.controller.AppUserController;
import com.vincent.demo.model.AppUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AppUserControllerUnitTest {

    @Test
    public void getUserByExistingId_shouldReturnCode200(){

        AppUserController userController = new AppUserController(new MockAppUserDao());
        ResponseEntity<AppUser> reponse = userController.get(1);

        Assertions.assertEquals(HttpStatus.OK, reponse.getStatusCode());

    }

    @Test
    public void getUserByNotExistingId_shouldReturnCode404(){

        AppUserController userController = new AppUserController(new MockAppUserDao());
        ResponseEntity<AppUser> reponse = userController.get(2);

        Assertions.assertEquals(HttpStatus.OK, reponse.getStatusCode());

    }
}
