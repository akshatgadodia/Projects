package com.blogapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blogapplication.entity.Post;

@Service
public interface PostService {
	List<Post> getAllPosts();
	Post getPostById(Long id);

}
