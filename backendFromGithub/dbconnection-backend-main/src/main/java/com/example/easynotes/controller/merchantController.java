package com.example.easynotes.controller;

import com.example.easynotes.model.MerchantDetails;
import com.example.easynotes.repository.merchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class merchantController {





    @Autowired
    merchantRepository merchantRepository;

    @CrossOrigin
  @GetMapping("/merchant/{mid}")
    public Optional<MerchantDetails> getmerchantDetails(@PathVariable Integer mid) {
             System.out.println("request for merchant details received for mid" +mid);
        return merchantRepository.findById(mid);

    }
}