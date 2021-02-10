package com.checkpoint.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.checkpoint.Entities.Utilisateur;



@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
