package org.afoninav.repository;

import java.util.List;

public interface GenericRepository<T,ID> {
    T create();
    T readById(ID id);
    T updateById(ID id);
    boolean deleteByID(ID id);
    List<T> readAll();
}
