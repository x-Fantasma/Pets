package co.pets.service;

import antlr.collections.List;

public interface CRUD<T> {

	void save(T t) throws Exception;
	void update(T t) throws Exception;
	void deleteById(String id);
	T getById(String id);
	List getAll();
}
