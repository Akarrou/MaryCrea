package fr.maryCrea.maryCrea.repository;


import fr.maryCrea.maryCrea.entity.DetailService;
import fr.maryCrea.maryCrea.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface DetailServiceRepository extends JpaRepository<DetailService, Long> {

    List<DetailService> findDetailServiceByIdServiceIs(Long id);
}
