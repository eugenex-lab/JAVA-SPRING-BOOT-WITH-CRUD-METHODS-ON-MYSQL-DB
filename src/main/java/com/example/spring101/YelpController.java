package com.example.spring101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class YelpController {

    @Autowired
    private YelpService service;

    @GetMapping("/foodvendors")
    public List<Yelp> list() {
        return service.ListAll();
    }

    @GetMapping("/foodvendors/{id}")
    public ResponseEntity<Yelp> get(@PathVariable Integer id) {
        try {
            Yelp yelp = service.get(id);
            return new ResponseEntity<Yelp>(yelp, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Yelp>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/foodvendors")
    public void add(@RequestBody Yelp yelp) {
        service.save(yelp);
    }

    @PutMapping("/foodvendors/{id}")
    public ResponseEntity<?> update(@RequestBody Yelp yelp,
                                    @PathVariable Integer id) {
        try {
            Yelp existYelp = service.get(id);
            service.save(yelp);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/foodvendors/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
