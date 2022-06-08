package com.filterexmpl.repository;

import com.filterexmpl.entity.UserAccount;

public interface UserAccountRepository
    extends org.springframework.data.jpa.repository.JpaRepository<UserAccount, Integer> {}
