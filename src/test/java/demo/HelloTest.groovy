package demo
/**
 * Created by neira on 04/01/16.
 */
class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "hi"

        where: hello  =  new Hello().sayHello()
    }
}
