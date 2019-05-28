package com.murilo3m.apirest.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.murilo3m.apirest.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
	
}
