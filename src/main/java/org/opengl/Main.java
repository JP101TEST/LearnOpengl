package org.opengl;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import static java.rmi.server.LogStream.log;

@Log4j2
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public boolean checkEmptyString(String input) {
        log.debug("This is a DEBUG message.");
        log.info("This is an INFO message.");
        log.error("This is an ERROR message.");
        return input.isEmpty();
    }

    @Data
    static class Car {
        private String model;
    }
}