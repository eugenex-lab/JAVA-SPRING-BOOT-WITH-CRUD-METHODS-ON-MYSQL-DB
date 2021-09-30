package com.example.spring101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YelpService {

    @Autowired  // an instace of product repository
    private YelpRepository repo;

    public List<Yelp> ListAll() {
        return repo.findAll();
    }

    public void save(Yelp yelp) {
        repo.save(yelp);
    }

    public Yelp get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

}




