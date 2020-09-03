package com.lambdaschool.countries.controllers;

import com.lambdaschool.countries.models.Country;
import com.lambdaschool.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController
{
    @Autowired
    private CountryRepository countryrepos;

    private List<Country> screenCountry(List<Country> myList, CheckCountry tester)
    {
        List<Country> tempList = new ArrayList<>();

        for (Country c : myList)
        {
            if(tester.test(c))
            {
                tempList.add(c)
            }
        }
    }


    // http://localhost:2019/names/all
    @GetMapping(value = "/names/all", produces = {"application/json"})
    public ResponseEntity<?> listAllCountries()
    {
        List<Country> myList = new ArrayList<>();

        countryrepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        for (Country c : myList)
        {
            System.out.println(c);
        }
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    // http://localhost:2019/names/start/u
    

    // http://localhost:2019/population/total
    // http://localhost:2019/population/min
    // http://localhost:2019/population/max

}
