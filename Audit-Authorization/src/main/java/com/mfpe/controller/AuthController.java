package com.mfpe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.model.ProjectManager;
//import com.mfpe.model.AuthenticationRequest;
//import com.mfpe.model.AuthenticationResponse;
//import com.mfpe.model.ProjectManagerDetails;

@RestController
@RequestMapping("/auth")	
@CrossOrigin(origins = "*")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
		// authentication - for the very first login
	@PostMapping("/authenticate")
	public ResponseEntity<String> generateJwt1(@Valid @RequestBody ProjectManager request){
		ResponseEntity<String> response = null;
		
		// authenticating the User-Credentials
		try {
		
			authenticationManager.authenticate
			(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
			response = new ResponseEntity<String>(request.getUsername(), HttpStatus.OK);
		
		}catch (Exception e) {
			response = new ResponseEntity<String>("Not Authorized Project Manager", HttpStatus.FORBIDDEN);
		}
		return response;
	}
	
	}
