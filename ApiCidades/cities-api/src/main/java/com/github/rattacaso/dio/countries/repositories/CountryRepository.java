package com.github.rattacaso.dio.countries.repositories;

import com.github.rattacaso.dio.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
