package com.github.springfox.bar;

import com.github.springfox.foo.Foo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bar")
@Data
@NoArgsConstructor
public class Bar {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany
	private List<Foo> foos;
}
