package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/punkty")
@RestController
public class PunktyController {
    private final StudentService service= new StudentService();
    @RequestMapping(value = "/students", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> GetUsers() {
        return service.getStudents();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Student AddUsers(@RequestBody NewStudent student) {
        return service.addStudents(student);
    }
}
