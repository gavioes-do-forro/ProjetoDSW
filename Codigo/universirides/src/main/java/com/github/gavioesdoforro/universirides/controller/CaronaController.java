package com.github.gavioesdoforro.universirides.controller;

import com.github.gavioesdoforro.universirides.modelo.Bairro;
import com.github.gavioesdoforro.universirides.modelo.Carona;
import com.github.gavioesdoforro.universirides.modelo.Usuario;
import com.github.gavioesdoforro.universirides.modelo.enums.Tipo;
import com.github.gavioesdoforro.universirides.modelo.enums.Turno;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioBairro;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioCarona;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/carona")
public class CaronaController {

    @Autowired
    private IRepositorioCarona repositorioCarona;

    @Autowired
    private IRepositorioBairro repositorioBairro;

    @Autowired
    private IRepositorioUsuario repositorioUsuario;

    @RequestMapping("/")
    public ModelAndView home() {
        List<Carona> listCaronas = repositorioCarona.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCaronas", listCaronas);
        return mav;
    }

    @RequestMapping("/new")
    public String newCaronaForm(Map<String, Object> model) {
        Carona carona = new Carona();
        model.put("carona", carona);
        model.put("tipos",Tipo.values());
        model.put("turnos", Turno.values());
        return "nova_carona";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCarona(@ModelAttribute("carona") Carona carona) {
        Bairro bairro = repositorioBairro.findById((long)1).get();
        Usuario usuario = repositorioUsuario.findById((long)2).get();
        carona.setBairro(bairro);
        carona.setUsuario(usuario);
        repositorioCarona.save(carona);
        return "redirect:/carona/";
    }

    @RequestMapping("/edit")
    public ModelAndView editCaronaForm(@RequestParam long id,Map<String, Object> model) {
        ModelAndView mav = new ModelAndView("edit_carona");
        Carona carona = repositorioCarona.getOne(id);
        mav.addObject("carona", carona);
        model.put("carona", carona);
        model.put("tipos",Tipo.values());
        model.put("turnos", Turno.values());
        return mav;
    }

    @RequestMapping("/delete")
    public String deleteCaronaForm(@RequestParam long id) {
        repositorioCarona.deleteById(id);
        return "redirect:/carona/";
    }
}
