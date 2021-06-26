package com.travel.explore.service.rent;

import java.util.List;

import com.travel.explore.entity.rent.CarEntity;
import com.travel.explore.repository.rent.CarRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Syihabuddin on 2021-03-11 14:24:34
 */

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Override
    public CarEntity addAction(CarEntity body) {
        return carRepo.save(body);
    }

    @Override
    public List<CarEntity> getAll() {
        return carRepo.findAll();
    }

    @Override
    public CarEntity getById(int id) {
        return carRepo.findById(id).get();
    }

    @Override
    public CarEntity updateAction(CarEntity body) {

        CarEntity carEntity = carRepo.findById(body.getId()).get();
        carEntity.setCarName(body.getCarName());
        carEntity.setColor(body.getColor());
        carEntity.setType(body.getType());
        carEntity.setNumber(body.getNumber());

        return carRepo.save(body);
    }

    @Override
    public void deleteById(int id) {
        carRepo.deleteById(id);
    }

}