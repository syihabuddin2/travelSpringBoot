package com.travel.explore.repository.rent;

import com.travel.explore.entity.rent.CarEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Syihabuddin on 2021-03-07 22:29:43
 */

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Integer> {

}