package com.example.integrationtesting2.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import com.example.integrationtesting2.DTO.ReportWithPathDTO;

public interface ReportWithPathService {
    Integer addReportWithPath();
    ResponseEntity<Resource> getReportWithPathById(Integer id);
}
