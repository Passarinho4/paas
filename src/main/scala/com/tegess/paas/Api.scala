package com.tegess.paas

import java.util.UUID

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class Api {

  val someRandomValue = UUID.randomUUID().toString

  @GetMapping(path = Array("/"))
  def get() = {
   "...............…………………………._¸„„„„_ </br>…………………….…………...„--~*'¯…….'\\ </br>………….…………………… („-~~--„¸_….,/ì'Ì </br>…….…………………….¸„-^\"¯ : : : : :¸-¯\"¯/' </br>……………………¸„„-^\"¯ : : : : : : : '\\¸„„,-\" </br>**¯¯¯'^^~-„„„----~^*'\"¯ : : : : : : : : : :¸-\" </br>.:.:.:.:.„-^\" : : : : : : : : : : : : : : : : :„-\" </br>:.:.:.:.:.:.:.:.:.:.: : : : : : : : : : ¸„-^¯ </br>.::.:.:.:.:.:.:.:. : : : : : : : ¸„„-^¯ </br>:.' : : '\\ : : : : : : : ;¸„„-~\" </br>:.:.:: :\"-„\"\"***/*'ì¸'¯ </br>:.': : : : :\"-„ : : :\"\\ </br>.:.:.: : : : :\" : : : : \\, </br>:.: : : : : : : : : : : : 'Ì </br>: : : : : : :, : : : : : :/ </br>\"-„_::::_„-*__„„~\""
  }

  @GetMapping(path = Array("/info"))
  def info() = {
    s"Instance id: $someRandomValue"
  }
}
