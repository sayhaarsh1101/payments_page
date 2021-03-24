package com.example.easynotes.repository;

import com.example.easynotes.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldRepository extends JpaRepository<Field,Integer> {

    List<Field> findByfieldid(Integer fieldid);

    List<Field> findBytemplateinstanceid(Integer templateinstanceid);
}
