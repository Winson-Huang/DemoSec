package demosec.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @GetMapping(path = "/{id}")
    public Optional<DemosecUser> getUserById(@PathVariable("id") Long id) {
        return demosecUserRepo.findById(id);
    }


    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    public DemosecUser registerUser(@RequestBody DemosecUserForm userForm) {
        DemosecUser user = new DemosecUser(
            userForm.getUsername(), 
            userForm.getPassword(), 
            userForm.getEmailaddress()
        );
        return demosecUserRepo.save(user);
    }
}