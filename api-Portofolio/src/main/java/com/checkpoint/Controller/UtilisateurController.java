package com.checkpoint.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.checkpoint.Service.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	UtilisateurService utilisateurService;

}
