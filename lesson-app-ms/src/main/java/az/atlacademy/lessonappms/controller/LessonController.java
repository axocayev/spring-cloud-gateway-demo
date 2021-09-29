package az.atlacademy.lessonappms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonController {
    @GetMapping("/list")
    public List<String> getList(){
        return List.of("Java","SQL","JavaScript");
    }
}
