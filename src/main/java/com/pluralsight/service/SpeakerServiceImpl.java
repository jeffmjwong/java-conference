package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private final SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
