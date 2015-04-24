package com.xebialabs.restito

import com.xebialabs.restito.builder.stub._
import com.xebialabs.restito.semantics.{Action, Condition}

package object scala {
  type StubServer = com.xebialabs.restito.server.StubServer

  object when {
    def http(ss: StubServer) = StubHttp.whenHttp(ss)
  }

  implicit class RichStubHttp(val sh: StubHttp) extends AnyVal {
    def matches(cs: Condition*): StubActioned = sh.`match`(cs: _*)
  }

  implicit class RichStubActioned(val sa: StubActioned) extends AnyVal {
    def respond(as: Action*): StubExpected = sa.`then`(as: _*)
  }
}
