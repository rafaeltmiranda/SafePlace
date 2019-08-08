package org.academiadecodigo.whiledlings.controllers;

import org.academiadecodigo.whiledlings.persistence.model.Option;
import org.academiadecodigo.whiledlings.services.QuestionService;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestQuestionController {

    private QuestionService questionService;

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    // TODO: 08/08/2019 addQuestion method

    @RequestMapping(method = RequestMethod.GET, path = "/{qid}")
    public ResponseEntity<List<Option>> showOptions(@PathVariable Integer qid){

        // TODO: 08/08/2019 this must be associated with a question id
        List<Option> optionsList = questionService.getOptionsList();


        return new ResponseEntity<>(optionsList, HttpStatus.OK);
    }
}