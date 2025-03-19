package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;


}
