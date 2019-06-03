package com.murilo3m.apirest.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.murilo3m.apirest.webflux.document.Playlist;
import com.murilo3m.apirest.webflux.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlaylistController {
	
	@Autowired
	PlaylistService service;
	
	@GetMapping(value="/playlist")
	public Flux<Playlist> getPlaylist(){
		return service.findAll();
	}
	
	@GetMapping(value="/playlist/{id}")
	public Mono<Playlist> getPlaylistId(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping(value="playlist")
	public Mono<Playlist> savePlaylist(@RequestBody Playlist playlist){
		return service.save(playlist);
	}
}
