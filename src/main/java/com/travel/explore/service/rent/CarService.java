package com.travel.explore.service.rent;

import java.util.List;

import com.travel.explore.entity.rent.CarEntity;

import org.springframework.stereotype.Component;

/**
 * Created By Syihabuddin on 2021-03-11 14:20:59
 */

@Component
public interface CarService {

    CarEntity addAction(CarEntity body);

    List<CarEntity> getAll();

    CarEntity getById(int id);

    CarEntity updateAction(CarEntity body);

    void deleteById(int id);

}