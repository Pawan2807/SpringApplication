package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Controller
@RestController
@RequestMapping("/hello")
public class getAPI {
    @GetMapping("/get")
    public String helloWorld() {
//        return GetFeatureJsonFromGit("https://github.com/gem-maulickbharadwaj/JewelAutomationBdd-master", "master").toString();
    return "hello";
    }
}
