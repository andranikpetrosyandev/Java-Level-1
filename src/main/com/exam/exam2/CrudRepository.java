package com.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.util.List;

@Repository
public interface CrudRepository<ENTITY, ID> {
    @Nullable
    ENTITY findById(ID id);

    List<ENTITY> findAll();
}
