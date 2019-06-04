package com.github.springfox.bar;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bars", path = "bars")
public interface BarRepository extends PagingAndSortingRepository<Bar, Integer> {
}
