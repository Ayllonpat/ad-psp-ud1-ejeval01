package com.salesianostriana.dam.resteval;


import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class PlaceController {

    @GetMapping("/place/")
    public ResponseEntity<PlaceListDto> mostrarTodos(){
       return new ResponseEntity<PlaceListDto>(
               
               HttpStatusCode.valueOf(404)
       );
    }

    @GetMapping("/place/{id}")
    public ResponseEntity<Place> mostrarPorId(){
        return new ResponseEntity<Place>(
                HttpStatusCode.valueOf(404)
        );
    }

    @PostMapping("/place/")
    public ResponseEntity<Place> crearPlace(){
        return new ResponseEntity<Place>(
                HttpStatusCode.valueOf(404)
        );
    }

    @PutMapping("/place/{id}")
    public ResponseEntity<Place> editarPlace(){
        return new ResponseEntity<Place>(
                HttpStatusCode.valueOf(404)
        );
    }

    @DeleteMapping("/place/{id}")
    public ResponseEntity<Place> borrarPlace(){
        return new ResponseEntity<Place>(
                HttpStatusCode.valueOf(404)
        );
    }

}
