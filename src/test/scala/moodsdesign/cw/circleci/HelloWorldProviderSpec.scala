package moodsdesign.cw.circleci

import org.scalatest._

class HelloWorldProviderSpec extends FlatSpec with Matchers {

  "A HelloWorldProvider" should "greet the world if no name is given" in {
    val provider = new HelloWorldProvider()
    provider.getHelloWorld should include ("world")
  }

  it should "greet the person specified" in {
    val name = "Fed"
    val provider = new HelloWorldProvider(name)
    provider.getHelloWorld should include (name)
  }

  it should "throw an exception if Java is mentioned" in {
    val name = "Java"
    the [IllegalArgumentException] thrownBy
      new HelloWorldProvider(name) should have message ("We don't do Java anymore")
  }

}