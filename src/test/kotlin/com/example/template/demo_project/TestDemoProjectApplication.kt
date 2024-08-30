package com.example.template.demo_project

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<DemoProjectApplication>().with(TestcontainersConfiguration::class).run(*args)
}
