package edu.sru.group7.roomallocation.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.sru.group7.roomallocation.domain.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {}