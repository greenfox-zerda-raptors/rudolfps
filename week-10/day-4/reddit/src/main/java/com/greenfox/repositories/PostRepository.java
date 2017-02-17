package com.greenfox.repositories;
import com.greenfox.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rudolfps on 2017.01.04..
 */
    public interface PostRepository extends CrudRepository<Post, Long> {

        /* still unbeliveable, but it works just fine with this oneliner */
    List<Post> findAllByOrderByScoreDesc();
    }

