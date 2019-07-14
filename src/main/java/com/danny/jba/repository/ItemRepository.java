package com.danny.jba.repository;

import com.danny.jba.entity.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.danny.jba.entity.Item;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByBlog(Blog blog, Pageable pageable);

    Item findByBlogAndLink(Blog blog, String link);
}
