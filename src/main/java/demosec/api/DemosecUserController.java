package demosec.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demosec.data.DemosecUserRepo;
import demosec.domain.DemosecUser;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "*")
public class DemosecUserController {
    
    @GetMapping(path = "/test")
    public String testMessage() {
        return "Controller Available.\n";
    }


    @Autowired
    DemosecUserRepo demosecUserRepo;

    @GetMapping
    public List<DemosecUser> getAllUser() {
        return demosecUserRepo.findAll();
    }
}
