package edu.wgu.d387_sample_code.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TimeZoneConverterController {




    @GetMapping("/presentation")
    public ResponseEntity<String> getPresentationTimes() {

        String presentationAnnouncement = "Live presentation at the Landon Hotel, and live streaming at: " + TimeZoneConverter.getTime();

        return new ResponseEntity<String>(presentationAnnouncement, HttpStatus.OK);
    }
}
