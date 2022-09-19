package com.springapideneme.controller;

import com.springapideneme.dto.KisiDto;
import com.springapideneme.service.KisiService;
import java.util.List;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/test/kisi")
@Api(value = "Kisi API Documentation")
@RequiredArgsConstructor

public class KisiController {

    private final KisiService kisiService;




     @PostMapping
     @ApiOperation(value = "Yeni-Kisi-Ekleme-Methodu")
    public ResponseEntity<KisiDto> SaveData(@Valid @RequestBody @ApiParam(value = "Şahıs") KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }


    @GetMapping
    @ApiOperation(value = "Veri-Getirme-Methodu")
    public ResponseEntity<List<KisiDto>> GetAll() {
        return ResponseEntity.ok(kisiService.getAll());
    }



}
