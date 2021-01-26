package com.agencevoyage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.Utilisateur;
import com.agencevoyage.repositories.UtilisateurRepository;
import com.agencevoyage.service.interfaces.IUtilisateurService;

@Service
public class UtilisateurServiceImp implements IUtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findOne(Long idUtilisateur) {
		return utilisateurRepository.findById(idUtilisateur).get();
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long idUtilisateur) {
		utilisateurRepository.deleteById(idUtilisateur);

	}

	@Override
	public Utilisateur findByUsername(String username) {
		return utilisateurRepository.findOneByUsername(username);
	}

}
