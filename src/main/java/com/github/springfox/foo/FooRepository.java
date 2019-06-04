package com.github.springfox.foo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "foos", path = "foos")
public interface FooRepository extends PagingAndSortingRepository<Foo, Integer> {
}
