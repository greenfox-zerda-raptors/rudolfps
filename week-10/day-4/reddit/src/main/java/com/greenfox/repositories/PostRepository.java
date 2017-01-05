package com.greenfox.repositories;
import com.greenfox.model.Post;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by rudolfps on 2017.01.04..
 */
    public interface PostRepository extends CrudRepository<Post, Long> {
    }

