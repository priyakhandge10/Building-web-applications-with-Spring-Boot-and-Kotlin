package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.runApplication
import org.springframework.boot.Banner

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
