package noyau.repository;

import java.util.List;

public interface Repository<T,Id> {
	public T save(T obj);
	public List<T> saveAll(List<T> list);
	public T update(T obj);
	public List<T> updateAll(List<T> list);
	public void delete(T obj);
	public void deleteAll(List<T> list);
	public T find(Id id);
	public List<T> findAll();
}
