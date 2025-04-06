package com.example.ticket.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ticket.entity.Station;
import com.example.ticket.util.ResponseResult;

public interface IStaionService extends IService<Station> {
    public ResponseResult selectAll();
    public ResponseResult selectByName(String name);
}
