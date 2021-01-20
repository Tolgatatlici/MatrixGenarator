package com.tolga.matrix.controller;

import com.tolga.matrix.Matrix;
import com.tolga.matrix.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MatrixController {

    @Autowired
    MatrixService matrixService;


    @RequestMapping("/")
    public String matrixGenarate(Model model){
        model.addAttribute("matrix", new Matrix());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String matrixGenerate(@ModelAttribute("matrix") Matrix matrix,Model model){
        int[][] matrixarray= matrixService.matrixGenerate(matrix);
        model.addAttribute("array",matrixarray);
        return "index";
    }

}
