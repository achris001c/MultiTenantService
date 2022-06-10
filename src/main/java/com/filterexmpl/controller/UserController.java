package com.filterexmpl.controller;

import com.filterexmpl.entity.UserAccount;
import com.filterexmpl.repository.UserAccountRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@Transactional
public class UserController {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private EntityManager entityManager;


    @GetMapping(path = "/{tenantId}/user/{userId}",produces = MediaType.TEXT_PLAIN_VALUE)
    public String getById(@PathVariable("tenantId")  int tenantId,
                          @PathVariable("userId") int userAccountId) {
        Session session = entityManager.unwrap(Session.class);
        session.enableFilter("userAccountFilter").setParameter("tenantId", tenantId);
        List<UserAccount> accounts = entityManager.createQuery(
                "select a from UserAccount a", UserAccount.class)
                .getResultList();
        userAccountRepository.findById(1);
        return "";
    }

}
