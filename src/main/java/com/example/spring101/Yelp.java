package com.example.spring101;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Yelp {
    private Integer id;
    private String resturantName;
    private Double avgFoodCost;
    private Double branchesNationwide;
    private String ratings;
    private Boolean wouldYouRecommend;

    public Yelp() {
    }

    public Yelp(Integer id, String resturantName, Double avgFoodCost,
                Double branchesNationwide, String ratings,
                Boolean wouldYouRecommend) {
        this.id = id;
        this.resturantName = resturantName;
        this.avgFoodCost = avgFoodCost;
        this.branchesNationwide = branchesNationwide;
        this.ratings = ratings;
        this.wouldYouRecommend = wouldYouRecommend;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public Double getAvgFoodCost() {
        return avgFoodCost;
    }

    public void setAvgFoodCost(Double avgFoodCost) {
        this.avgFoodCost = avgFoodCost;
    }

    public Double getBranchesNationwide() {
        return branchesNationwide;
    }

    public void setBranchesNationwide(Double branchesNationwide) {
        this.branchesNationwide = branchesNationwide;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public Boolean getWouldYouRecommend() {
        return wouldYouRecommend;
    }

    public void setWouldYouRecommend(Boolean wouldYouRecommend) {
        this.wouldYouRecommend = wouldYouRecommend;
    }
}