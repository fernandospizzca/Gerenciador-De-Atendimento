package br.com.spizzca.GerenciadorDeAtendimento.controller;

import br.com.spizzca.GerenciadorDeAtendimento.model.Cliente;
import br.com.spizzca.GerenciadorDeAtendimento.repository.CadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CliController {

    @Autowired
    private CadRepository repository;

    @GetMapping("/clientes")
    public ModelAndView cliente(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clientes");

        modelAndView.addObject("allClientes", repository.findAll());

        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView clienteSearch(@RequestParam(value = "nome") final String nome) {

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clientes");

        modelAndView.addObject("allClientes", repository.findByNameContainingIgnoreCase(nome));
        return modelAndView;
    }

    @GetMapping("/novo-cliente")
    public String novoCliente(Model model) {

        model.addAttribute("cliente", new Cliente());

        return "novo-cliente";
    }

    @PostMapping("/clientes")
    public String createCliente(@Valid @ModelAttribute Cliente cliente, BindingResult result, RedirectAttributes redirectAttributes){

        if(result.hasErrors()){
            return "novo-cliente";
        }

        repository.save(cliente);

        redirectAttributes.addFlashAttribute("message", "Cliente cadatrado com sucesso.");

        return "redirect:clientes";

    }
}