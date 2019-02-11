package com.app.busbooking.service;

import java.util.List;


public interface IGenralService<T> {

  public List<T> getAll();

  public void save(T object) throws Exception;

  public T get(Integer id);

//  public T getbyClause(String condition, T object);

  public int count();
  
  public void delete(Integer id);
}
