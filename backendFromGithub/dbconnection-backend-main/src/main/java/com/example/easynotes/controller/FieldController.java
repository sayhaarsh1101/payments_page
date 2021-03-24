package com.example.easynotes.controller;

import com.example.easynotes.model.Field;
import com.example.easynotes.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FieldController {

    @Autowired
    private FieldRepository fieldRepository;

   /* @RequestMapping(
            method = RequestMethod.GET,
            path = "/fields",
            produces = MediaType.TEXT_HTML_VALUE
    )
    @ResponseBody
    public List<Field> getFields() {
        return fieldRepository.findAll();
    }*/

    ////////////////////////get by templateInstanceid////////////////////

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/field/{templateinstanceid}",
            produces = MediaType.TEXT_HTML_VALUE
    )
    @ResponseBody
    public List<Field> getFields(@PathVariable Integer templateinstanceid) {
        return fieldRepository.findBytemplateinstanceid(templateinstanceid);
    }
}
