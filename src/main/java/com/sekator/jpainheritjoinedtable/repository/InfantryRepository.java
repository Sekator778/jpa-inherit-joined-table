package com.sekator.jpainheritjoinedtable.repository;

import com.sekator.jpainheritjoinedtable.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}
