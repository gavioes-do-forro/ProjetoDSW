package com.github.gavioesdoforro.universirides.controller;

import com.github.gavioesdoforro.universirides.modelo.Carona;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioCarona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ControllerExampleJSP {

    @Autowired
    private IRepositorioCarona repositorioCarona;

    @RequestMapping("/")
    public ModelAndView home() {
        List<Carona> listCaronas = repositorioCarona.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCaronas", listCaronas);
        return mav;
    }

}
