package com.riri.security.repository;

import com.riri.security.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser,Long> {
    AppUser findByUserName(String username);
    AppUser findByEmail(String email);
    Long countByEmail(String email);
    Long countByUserName(String username);

}