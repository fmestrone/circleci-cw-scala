package moodsdesign.cw.circleci

class HelloWorldProvider(val name: String = "world") {
    def getHelloWorld = s"Hello $name!"
}
