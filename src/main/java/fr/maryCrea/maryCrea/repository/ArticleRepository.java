package fr.maryCrea.maryCrea.repository;

import fr.maryCrea.maryCrea.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
