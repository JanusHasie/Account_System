package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.persistence.UserDetails;

public interface CreateUserDetailsFlow {
    UserDetails create(UserDetails userIDnum);
}
