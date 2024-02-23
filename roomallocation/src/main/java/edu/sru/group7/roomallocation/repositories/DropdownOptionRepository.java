package edu.sru.group7.roomallocation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import edu.sru.group7.roomallocation.domain.DropdownOption;

@NoRepositoryBean
public interface DropdownOptionRepository<T extends DropdownOption> extends CrudRepository<T, Integer>{

}
