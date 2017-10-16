package com.tegess.paas

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}

object Server extends App {

  private val run: Array[Class[_]] = Array(classOf[MainConfig])
  SpringApplication.run(run, args)

}

@EnableAutoConfiguration
@Configuration
@ComponentScan
class MainConfig {


  @Bean
  def mapper: ObjectMapper = {
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)
    mapper
  }

}