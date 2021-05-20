package com.github.ednavan.cities.api.repository;

import com.github.ednavan.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}

