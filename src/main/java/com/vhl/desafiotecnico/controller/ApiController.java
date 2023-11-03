package com.vhl.desafiotecnico.controller;

import br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual;
import br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument;
import br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument;
import br.jus.tjsc.www.selo.impl.GetEntesDeclaradosUtilidadePublicaEstadualDocumentImpl;
import com.vhl.desafiotecnico.wsdl.Exception_Exception;
import com.vhl.desafiotecnico.wsdl.SeloService;
import com.vhl.desafiotecnico.wsdl.SeloService_Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import samples.service.xmlbeans.ExceptionException;
import samples.service.xmlbeans.SeloServiceStub;

import java.rmi.RemoteException;
import java.util.List;

@RestController
public class ApiController {


    @GetMapping("/home")
    public ResponseEntity<?> home() throws ExceptionException, RemoteException {
        SeloServiceStub stub = new SeloServiceStub();
        GetEntesDeclaradosUtilidadePublicaEstadualDocumentImpl foo = new GetEntesDeclaradosUtilidadePublicaEstadualDocumentImpl(GetEntesDeclaradosUtilidadePublicaEstadualDocument.type);
        GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument entesDeclaradosUtilidadePublicaEstadual = stub.getEntesDeclaradosUtilidadePublicaEstadual(foo);
        EnteDeclaradoUtilidadePublicaEstadual[] entesDeclaradosUtilidadePublicaEstadualArray = entesDeclaradosUtilidadePublicaEstadual.getGetEntesDeclaradosUtilidadePublicaEstadualResponse().getEntesDeclaradosUtilidadePublicaEstadualArray();
        for (EnteDeclaradoUtilidadePublicaEstadual ente : entesDeclaradosUtilidadePublicaEstadualArray) {
            System.out.println(ente.toString());
        }
        return ResponseEntity.ok("teste");
    }
}
