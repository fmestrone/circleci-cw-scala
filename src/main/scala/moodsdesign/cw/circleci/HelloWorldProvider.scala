package moodsdesign.cw.circleci

class HelloWorldProvider(val name: String = "world") {
    if (name.equalsIgnoreCase("java"))
        throw new IllegalArgumentException("We don't do Java anymore")
    def getHelloWorld = s"Hello $name!"
}
