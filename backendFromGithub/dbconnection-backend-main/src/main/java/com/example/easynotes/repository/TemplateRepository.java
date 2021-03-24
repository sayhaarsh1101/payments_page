package com.example.easynotes.repository;

import com.example.easynotes.model.HtmlTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateRepository extends JpaRepository<HtmlTemplate, Integer> {
    List<HtmlTemplate> findBytemplateid(Integer templateid);

    /*public  String findTemplate();*/
}