package pbtest

import zio.test.Assertion._
import zio.test._

object HelloWorldTest extends ZIOSpecDefault:
  def spec = suite("HelloWorld tests")(
    test("Test 1") {
      assert(HelloWorld.msg)(equalTo("Hello World"))
    }
  )
