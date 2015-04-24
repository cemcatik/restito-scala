restito-scala - a Scala wrapper for [Restito](https://github.com/mkotsur/restito)
=============================================

Unfortunate thing is [Restito](https://github.com/mkotsur/restito) uses `match` and
`then` heavily. `match` is a Scala keyword and `then` is currently reserved to be
used as a keyword in a future version of Scala. This makes it a pain to use Restito
from Scala.

With this project our goal is to provide an alternative syntax to make Restito more
Scala friendly.

## Dependency

Until this library is deployed to a Maven repository you need to depend on this project
from your `build.sbt`:

```scala
lazy val restitoScala = RootProject(uri("https://github.com/cemcatik/restito-scala.git"))

dependsOn(restitoScala)
```

## Usage

```scala
import com.xebialabs.restito.scala._
import com.xebialabs.restito.semantics.Condition._
import com.xebialabs.restito.semantics.Action._

val stubServer = StubServer(19001)
stubServer.run()

when http stubServer matches (
  get("/v1/users/id")
) respond (
  ok(),
  stringContent("""{"name": "cemcatik"}""")
)

stubServer.stop()
```

## Background

Take a look at this simple example in Java:

```java
whenHttp(server).
  match(get("/demo")).
  then(status(HttpStatus.OK_200));
```

The same example looks out of place in Scala:

```scala
whenHttp(server).
  `match`(get("/demo")).
  `then`(status(HttpStatus.OK_200))
```

Another thing that caught my attention was the heavy dependence on external libraries
even in the simplest of use cases. For example for the simpleset example above the required
imports are shown below.

```scala
import com.xebialabs.restito.server.StubServer
import com.xebialabs.restito.builder.stub.StubHttp
import com.xebialabs.restito.semantics.Condition._
import com.xebialabs.restito.semantics.Action._
import org.glassfish.grizzly.http.util.HttpStatus
```
