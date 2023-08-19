package demosec.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/content")
public class ContentController {

    @GetMapping
    public String contentNeedAuth() {
        return "You are an authed user.\n";
    }
}
