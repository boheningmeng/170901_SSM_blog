package com.llh.controller;

import com.llh.pojo.Category;
import com.llh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by LENOVO on 2017/9/1.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/select")
    public ModelAndView select(){
        List<Category> inform = categoryService.select();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("inform",inform);
        modelAndView.setViewName("/WEB-INF/jsp/category.jsp");
        return modelAndView;
    }
}
