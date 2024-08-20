package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RechercheEntrepriseService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String rechercherParNom(String nom) {
        return "Résultat de la recherche par nom";
    }

    public String rechercherParSiret(String siret) {
        return "Résultat de la recherche par SIRET";
    }
}