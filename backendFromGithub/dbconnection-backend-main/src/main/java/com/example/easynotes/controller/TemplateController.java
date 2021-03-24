package com.example.easynotes.controller;

import com.example.easynotes.model.Field;
import com.example.easynotes.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TemplateController {

    @Autowired
    TemplateRepository templateRepository;

    @Autowired
    private FieldController fieldController;


    @RequestMapping(
            method = RequestMethod.GET,
            path = "/template/{templateid}",
            /*params = "templateid",*/
            produces = MediaType.TEXT_HTML_VALUE
    )
    @ResponseBody
    public String getTemplate(@PathVariable Integer templateid) {

        /*return templateRepository.findBytemplateid(templateid).get(0).getHtml();*/

        String htmlStr=templateRepository.findBytemplateid(templateid).get(0).getHtml();

        List<Field> fields=fieldController.getFields(1);
        int fieldListSize= fields.size();
        int x=htmlStr.indexOf("<form id=\"datacollectform\">");

        StringBuilder strB=new StringBuilder(htmlStr.substring(0,x+30));

        for(Field f: fields){


            String labelHtml="<div class=\"row\">\n" +
                    "            <div class=\"col-25\">\n" +
                    "              <label for="+f.getLabel()+">"+"<b>"+f.getLabel()+"</b>"+"</label>\n" +
                    "            </div>\n" +
                    "            <div class=\"col-75\">\n" +
                    "              <input type="+f.getType()+ " placeholder="+ f.getDefaultvalue()+" class=\"phone\" id=\"phone\" required><br>\n" +
                    "            </div>\n" +
                    "          </div>";



            strB.append(labelHtml);

        }
        return String.valueOf(strB.append(htmlStr.substring(x+30, htmlStr.length())));

    }

/*        Htmlstr = <html><tilte><form id=”frm”></frm></title></html>
                                              X
        StringBuilder strB = new StringBuilder(htmlStr.subString(0, x));
// strB = <html><tilte><form id=”frm”>
        Query DB for fields for templateId
        for( each fieldRow in fieldsResult from query result for template) {
            String labelHtml = “<div class=””>” + fieldRow.get(34) + “</div>”;
            strB.append(labelHtml);
            String valueHtml = “<div class=””><input type=’text’ class=’’>” + fieldRow.g

            String valueHtml = “<div class=””><input type=’text’ class=’’>” + fieldRow.get(34) + “</input></div>”;
            strB.append(labelHtml);

        }
        strB.Append(htmlStr.subString(X, HtmlStr.length());*/

      /*   @ResponseBody
        public String getTemplate(@PathVariable Integer templateId) {
            String templateStr= templateRepo.findByTemplateid(templateId).get(0).getHtml();
            int x=templateStr.indexOf("<form id=\"datacollectform\">");
            //querry from fields table for the templateid
            //generate labelHtml string and paste it (x+length of form id tag)
            //generate textField html for value field and append the above generated string
            //append the remaining part of html
        }*/

}