package demosec.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "*")
public class DemosecUserController {
    
    @GetMapping(path = "/test")
    public String testMessage() {
        return "Controller Available.\n";
    }
}
