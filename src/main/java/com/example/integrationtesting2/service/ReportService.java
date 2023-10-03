package com.example.integrationtesting2.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import com.example.integrationtesting2.DTO.ReportDTO;


public interface ReportService {
    Integer addReport();
    ResponseEntity<Resource> getReportById(Integer id);
}
