package com.example.demo.service;

public interface IStudentService {

	// --- DELETE METHOD IN CrudRepository--
	// void deleteById(ID id)
	// void delete(T Entity)
	// void deleteAllById(Iterable<? extends ID>ids)
	// void deteleAll(Iterable <? extends T> entities)

	public String studentRemoveById(Integer id);

}
