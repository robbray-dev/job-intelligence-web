package com.job_intel.backend.job_board_apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class RapidApiService {

    @Value("${rapid.api.key}")
    private String apiKey;
}
