package kz.kaznitu.lessons.controllers;

import kz.kaznitu.lessons.models.TestModel;
import kz.kaznitu.lessons.repositories.TestRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestRepositories repositories ;

    @GetMapping("/")
    public String test(Model model){
        List<TestModel> models = repositories.findAll() ;
        model.addAttribute("models", models) ;
        return "test" ;
    }
}
