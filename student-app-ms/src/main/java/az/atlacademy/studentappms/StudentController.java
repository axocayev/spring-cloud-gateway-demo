package az.atlacademy.studentappms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/list")
    public List<String> getList(){
        return List.of("Ferid","Nihad","Yunus");
    }
}
