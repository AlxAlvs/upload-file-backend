package com.upload.file.controllers;


import com.upload.file.entities.Agentes;
import com.upload.file.entities.ResponseMessage;
import com.upload.file.service.AgenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@CrossOrigin("http://localhost:4200")
public class UploadFileController {

    @Autowired
    private AgenteService agenteService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestBody Agentes agentes) {
        log.info("Receiving file");

        String message = "";
        try {
            agenteService.store(agentes.getAgente());
            message = "saved the file successfully";
            log.info(message);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not save the file";
            log.error(message + e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
        }
    }


}
