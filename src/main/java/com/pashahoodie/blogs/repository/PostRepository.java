package com.pashahoodie.blogs.repository;

import com.pashahoodie.blogs.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
