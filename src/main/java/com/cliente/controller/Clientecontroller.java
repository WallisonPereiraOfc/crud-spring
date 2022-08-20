package com.cliente.controller;

import com.cliente.models.Cliente;
import com.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
    public class Clientecontroller{

    @Autowired
    private ClienteRepository cr;

    @RequestMapping("/cliente")
    public ModelAndView listacclientes(){
        ModelAndView mv=new ModelAndView("index");
        Iterable<Cliente>clientes=cr.findAll();
        mv.addObject("Clientes", clientes);
        return mv;
    }
}