package fr.maryCrea.maryCrea.repository;


import fr.maryCrea.maryCrea.model.User;

import java.util.ArrayList;
import java.util.List;

public class ConnexionRepository {
    public boolean findByEmail(String email, String password) {
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                if (password.equals(user.getPassword())){
                    return true;
                }

            }
        }
        return false;
    }

    private static List<User> users = new ArrayList<User>() {
        {
            add(new User(0L,"Jerome","Valette","Jeromevalette@orange.fr","marvin"));
            add(new User(1L,"herve","simon","hervevalette@orange.fr","marvi"));
            add(new User(2L,"Francoise","Valette","francoisevalette@orange.fr","marv"));
            add(new User(3L,"linette","Valette","linettevalette@orange.fr","mar"));

        }
    };
}
