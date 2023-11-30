package org.example.Wiem_LSI3_SOA_TP6;
import org.example.entities.Compte;
import org.example.entities.EtatCompte;
import org.example.entities.TypeCompte;
import org.example.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.repositories")
@EntityScan("org.example.entities")
@ComponentScan("org.example")
public class WiemLSI3SOATP6Application {
    public static void main(String[] args) {
        SpringApplication.run(WiemLSI3SOATP6Application.class, args);
    }
    @Bean
    public CommandLineRunner CLR (CompteRepository compteRepository){
        return (args) -> {
            // Ajout des Comptes
            Compte compteEpargne1 = new Compte(null, 900.0,new Date(), TypeCompte.EPARGNE, EtatCompte.CREE );
            Compte compteEpargne2 = new Compte(null, 1569.0,new Date(), TypeCompte.EPARGNE, EtatCompte.CREE);
            Compte compteCourant = new Compte(null, 500.0,new Date(), TypeCompte.COURANT, EtatCompte.CREE);
            compteRepository.save(compteCourant);
            compteRepository.save(compteEpargne1);
            compteRepository.save(compteEpargne2);

            // Afficher les soldes des comptes
            System.out.println("Soldes des comptes :");
            List<Compte> comptes = compteRepository.findAll();
            for (Compte compte : comptes) {
                System.out.println("Le compte avec l'ID :"+compte.getId()+" ,Solde ="+compte.getSolde());
            }
        };
    }
}


