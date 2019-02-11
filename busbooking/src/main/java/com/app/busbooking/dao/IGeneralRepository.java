package com.app.busbooking.dao;

import java.util.List;


public interface IGeneralRepository<T> {

  public List<T> getAll();

  public void save(T object) throws Exception;

  public T get(Integer id);

//  public T getbyClause(String condition, T object);

  public int count();

  public void delete(Integer id);
  
  
}
