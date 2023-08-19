package demosec.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class DemosecUserForm {
    
    private final String username;

    private final String password;

    private final String emailaddress;
}
