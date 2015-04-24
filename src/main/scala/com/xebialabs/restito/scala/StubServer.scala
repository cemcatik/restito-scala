package com.xebialabs.restito.scala

import com.xebialabs.restito.semantics.Stub
import com.xebialabs.restito.server.{StubServer => XStubServer}

object StubServer {
  def apply() = new XStubServer()
  def apply(stubs: Seq[Stub]) = new XStubServer(stubs.toArray: _*)
  def apply(port: Int, stubs: Seq[Stub] = Nil) = new XStubServer(port, stubs.toArray: _*)
}
