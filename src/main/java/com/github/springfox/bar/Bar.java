package com.github.springfox.bar;

import com.github.springfox.foo.Foo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bar")
public class Bar {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany
	private List<Foo> foos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Foo> getFoos() {
		return foos;
	}

	public void setFoos(List<Foo> foos) {
		this.foos = foos;
	}
}
