package example

import spock.lang.Specification

class Example1SimpleSpockTest extends Specification {
    def "simple test"() {
        given: "new instance with initial value 2"
        def calc = new Calculator(2)

        when: "adding 3 to initial value"
        calc.add(3)

        then: "result must equal 5"
        calc.getValue() == 5
    }

    def "simple test throwing an exception"() {
        given: "new instance with initial value 2"
        def calc = new Calculator(2)

        when: "adding -3 to initial value"
        calc.add(-3)

        then: "Expecting an exception"
        def ex = thrown(IllegalArgumentException)
        ex.getMessage() == "negative value is not allow in this method"
    }
}
