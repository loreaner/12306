package com.example.ticket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ticket.entity.Station;
import com.example.ticket.mapper.StationMapper;
import com.example.ticket.service.IStaionService;
import com.example.ticket.util.ResponseResult;
import org.springframework.stereotype.Service;

@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStaionService {
    @Override
    public ResponseResult selectByName(String name) {
        QueryWrapper<Station> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("station", name);
        return ResponseResult.success(getOne(queryWrapper));
    }
    @Override
    public ResponseResult selectAll() {
        return ResponseResult.success(list());


}}
