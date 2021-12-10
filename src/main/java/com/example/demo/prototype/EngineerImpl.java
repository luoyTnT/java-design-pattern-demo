package com.example.demo.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EngineerImpl extends Engineer {

    @Override
    public void develop(String program) {
        log.info("{}:{} {}", this.getDuty(), this.getEngineerName(), program);
    }
}
