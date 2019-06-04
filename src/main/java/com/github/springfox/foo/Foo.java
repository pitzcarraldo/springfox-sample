package com.github.springfox.foo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foo")
@Data
@NoArgsConstructor
public class Foo {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
}
