package fr.maryCrea.maryCrea.repository;

import fr.maryCrea.maryCrea.entity.Service;
import fr.maryCrea.maryCrea.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Service, Long> {
}
