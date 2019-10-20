package fr.maryCrea.maryCrea.repository;

import ch.qos.logback.classic.spi.LoggerRemoteView;
import fr.maryCrea.maryCrea.model.Article;

import java.sql.ClientInfoStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    public List<Article> findAll() {

        return articles;
    }


    public Article findById(Long id) {
        for (Article article : articles) {
            if (id.equals(article.getId())) {
                return article;
            }
        }
        return null;
    }
    private static List<Article> articles =new ArrayList<Article>(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        {
            try {
                add(new Article(0L, "Titre1", "mlkjgfsdlgfhsuyrtq,xe mzekrjqzep ruzzjernazkejcn ","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, aliquam amet aperiam autem cumque delenitdignissimos dolorum eius error est explicabo libero, molestias mollitia obcaecati omnis, perspiciatis possimusquidem sed?", "http://via.placeholder.com/540x260", simpleDateFormat.parse("01/07/2015")));
                add(new Article(1L, "Titre2", "xcvbcvb,xe mzekrjqzep ruzzjernazkejcn ","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, aliquam amet aperiam autem cumque delenitdignissimos dolorum eius error est explicabo libero, molestias mollitia obcaecati omnis, perspiciatis possimusquidem sed?", "http://via.placeholder.com/540x260", simpleDateFormat.parse("01/06/2015")));
                add(new Article(2L, "Titre3", "yuiyui,xe mzekrjqzep ruzzjernazkejcn ", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, aliquam amet aperiam autem cumque delenitdignissimos dolorum eius error est explicabo libero, molestias mollitia obcaecati omnis, perspiciatis possimusquidem sed?","http://via.placeholder.com/540x260", simpleDateFormat.parse("01/07/2015")));
                add(new Article(3L, "Titre4", "lmklmklm,xe mzekrjqzep ruzzjernazkejcn ","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, aliquam amet aperiam autem cumque delenitdignissimos dolorum eius error est explicabo libero, molestias mollitia obcaecati omnis, perspiciatis possimusquidem sed?", "http://via.placeholder.com/540x260", simpleDateFormat.parse("01/08/2015")));
                add(new Article(40L, "Titre5", "arezerzer,xe mzekrjqzep ruzzjernazkejcn ","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, aliquam amet aperiam autem cumque delenitdignissimos dolorum eius error est explicabo libero, molestias mollitia obcaecati omnis, perspiciatis possimusquidem sed?", "http://via.placeholder.com/540x260", simpleDateFormat.parse("01/09/2015")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    };
}
