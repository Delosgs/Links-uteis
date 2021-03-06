package com.delanogs.Cities_Api.countries.resources;

import com.delanogs.Cities_Api.countries.entities.Country;
import com.delanogs.Cities_Api.countries.repositories.CountryRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
