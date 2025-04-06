package com.example.ticket.controller;

import com.example.ticket.entity.Station;
import com.example.ticket.service.IStaionService;
import com.example.ticket.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ticket")
@RestController
public class StationController {
    @Autowired
    IStaionService stationService;
    public ResponseResult selectByName(String name) {
        return stationService.selectByName(name);
    }
}
