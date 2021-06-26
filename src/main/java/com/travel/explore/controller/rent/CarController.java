package com.travel.explore.controller.rent;

import java.util.List;

import com.travel.explore.entity.rent.CarEntity;
import com.travel.explore.repository.rent.CarRepo;
import com.travel.explore.util.response.CommonResponse;
import com.travel.explore.util.response.CommonResponseGenerator;
import com.travel.explore.service.rent.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Syihabuddin on 2021-03-07 20:49:12
 */

@RestController
@RequestMapping(value = "/travel")
public class CarController {

    @Autowired
    CarRepo carRepo;

    @Autowired
    CarService carService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @GetMapping(value = "checkAPI")
    public String api() {
        return "Data found";
    }

    @PostMapping(value = "addAction")
    public CommonResponse<CarEntity> addAction(@RequestBody CarEntity body) {
        try {
            CarEntity car = carService.addAction(body);
            return commonResponseGenerator.successResponse(car, "Success add new car");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @GetMapping(value = "getAll")
    public CommonResponse<List<CarEntity>> getList() {
        try {
            List<CarEntity> car = carService.getAll();
            return commonResponseGenerator.successResponse(car, "Success get all car");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @GetMapping(value = "getById")
    public CommonResponse<CarEntity> getById(@RequestParam int id) {
        try {
            CarEntity car = carService.getById(id);
            return commonResponseGenerator.successResponse(car, "Success get car by id : " + id);
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @PostMapping(value = "updateAction")
    public CommonResponse<CarEntity> updateAction(@RequestBody CarEntity body) {
        try {
            CarEntity car = carService.updateAction(body);
            return commonResponseGenerator.successResponse(car, "Car updated successfully");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage() + " for id : " + body.getId());
        }
    }

    @PostMapping(value = "deleteAction")
    public CommonResponse<List<CarEntity>> deleteAction(@RequestParam int id) {
        try {
            carService.deleteById(id);

            List<CarEntity> carList = carService.getAll();
            return commonResponseGenerator.successResponse(carList, "Car deleted successfully");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }

    }
}