package com.tst

import com.gen.Foogen
import com.gen.Bargen
import com.live.Foo
import com.live.Bar

object Server extends App {

  val foogen = Foogen("foogen")
  val bargen = Bargen("bargen")

  val foo = Foo("foo", false)
  val bar = Bar("bar", true)
}
