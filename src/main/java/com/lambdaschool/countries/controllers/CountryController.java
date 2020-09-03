package com.lambdaschool.countries.controllers;

import com.lambdaschool.countries.models.Country;
import com.lambdaschool.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
                tempList.add(c);
            }
        }
        return tempList;
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
    @GetMapping(value = "/names/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> listAllByFirstLetter(@PathVariable char letter)
    {
        List<Country> myList = new ArrayList<>();
        countryrepos.findAll().iterator().forEachRemaining(myList::add);

        List<Country> rtnList = screenCountry(myList, e -> e.getName().charAt(0) == Character.toUpperCase(letter));

        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    // http://localhost:2019/population/total

    @GetMapping(value = "/population/total", produces = {"application/json"})
    public ResponseEntity<?> displayTotalPop()
    {
        List<Country> myList = new ArrayList<>();

        countryrepos.findAll().iterator().forEachRemaining(myList::add);

        long total = 0;
        for (Country c : myList)
        {
            total = total + c.getPopulation();
        }

        System.out.println("The Total Population is " + total);
        return new ResponseEntity<>("The Total Population is " + total, HttpStatus.OK);
    }
    // http://localhost:2019/population/min

    @GetMapping(value = "/population/min", produces = {"application/json"})
    public ResponseEntity<?> displayMinPop()
    {
        List<Country> myList = new ArrayList<>();

        countryrepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));

        Country minPop = myList.get(0);

        return new ResponseEntity<>(minPop, HttpStatus.OK);
    }
    // http://localhost:2019/population/max
    @GetMapping(value = "/population/max", produces = {"application/json"})
    public ResponseEntity<?> displayMaxPop()
    {
        List<Country> myList = new ArrayList<>();

        countryrepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((c1, c2) -> Long.compare(c2.getPopulation(), c1.getPopulation()));

        Country maxPop = myList.get(0);

        return new ResponseEntity<>(maxPop, HttpStatus.OK);
    }
}
