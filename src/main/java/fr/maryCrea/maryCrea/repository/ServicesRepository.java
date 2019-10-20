package fr.maryCrea.maryCrea.repository;

import fr.maryCrea.maryCrea.model.Service;

import java.util.ArrayList;
import java.util.List;

public class ServicesRepository {
    public List<Service> findAll() {
        return services;
    }

    public Service findById(Long id) {
        for (Service service : services) {
            if (id.equals(service.getId())) {
                return service;
            }
        }
        return null;
    }

    private static List<Service> services = new ArrayList<Service>() {
        {
            add(new Service(0L, "Mon service 1", "http://via.placeholder.com/540x260", "c'est un super service", "mrehfmsklfjzerxzervmeprùpoe é'opr épodsfg eg rt tertqefxzeexdsfqs gsgsgdfgdfgfqzterqrtvqzrtxqzr vf "));
            add(new Service(1L, "Mon service 2", "http://via.placeholder.com/540x260", "c'est un super service", "mrehfmsklfjzerxzervmeprùpoe é'opr épodsfg eg rt tertqefxzeexdsfqs gsgsgdfgdfgfqzterqrtvqzrtxqzr vf "));
            add(new Service(2L, "Mon service 3", "http://via.placeholder.com/540x260", "c'est un super service", "mrehfmsklfjzerxzervmeprùpoe é'opr épodsfg eg rt tertqefxzeexdsfqs gsgsgdfgdfgfqzterqrtvqzrtxqzr vf "));
            add(new Service(3L, "Mon service 4", "http://via.placeholder.com/540x260", "c'est un super service", "mrehfmsklfjzerxzervmeprùpoe é'opr épodsfg eg rt tertqefxzeexdsfqs gsgsgdfgdfgfqzterqrtvqzrtxqzr vf "));
            add(new Service(4L, "Mon service 5", "http://via.placeholder.com/540x260", "c'est un super service", "mrehfmsklfjzerxzervmeprùpoe é'opr épodsfg eg rt tertqefxzeexdsfqs gsgsgdfgdfgfqzterqrtvqzrtxqzr vf "));
        }
    };
}
