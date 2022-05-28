package com.blogapplication.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapplication.dto.PostDto;
import com.blogapplication.entity.Post;
import com.blogapplication.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
    private ModelMapper modelMapper;
	
	private PostDto postToPostDto(Post post) {
		PostDto postDto = modelMapper.map(post, PostDto.class);
	    return postDto;
	}
	
	/*private Post postDtoToPost(PostDto postDto) {
	    Post post = modelMapper.map(postDto, Post.class);
	    return post;
	}*/
	
	//@PreAuthorize("hasRole('ADMIN')") works only for post
	@GetMapping
	public ResponseEntity<List<PostDto>> getAllPosts(){
		List<PostDto> list = postService.getAllPosts().stream()
		          .map(this::postToPostDto)
		          .collect(Collectors.toList());
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id) {
		Post post = postService.getPostById(id);
        return new ResponseEntity<>(postToPostDto(post),HttpStatus.OK);
    }

}
