package tn.esprit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import org.springframework.stereotype.Repository;

import tn.esprit.demo.entity.Contrat;


@Repository
public interface ContratRepo extends JpaRepository<Contrat, Integer> {
	
	

}
