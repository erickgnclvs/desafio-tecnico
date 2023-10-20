package com.vhl.desafiotecnico.controller;

import com.vhl.desafiotecnico.wsdl.EnteDeclaradoUtilidadePublicaEstadual;
import com.vhl.desafiotecnico.wsdl.Exception_Exception;
import com.vhl.desafiotecnico.wsdl.SeloService;
import com.vhl.desafiotecnico.wsdl.SeloService_Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {


    @GetMapping("/home")
    public ResponseEntity<?> home() throws Exception_Exception {
        SeloService_Service seloService = new SeloService_Service();
        List<EnteDeclaradoUtilidadePublicaEstadual> entesDeclaradosUtilidadePublicaEstadual = seloService.getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual();
        return ResponseEntity.ok(entesDeclaradosUtilidadePublicaEstadual);
    }
}
