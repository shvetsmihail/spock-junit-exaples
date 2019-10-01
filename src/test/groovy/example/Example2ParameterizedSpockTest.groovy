package example

import spock.lang.Specification
import spock.lang.Unroll


class Example2ParameterizedSpockTest extends Specification {
    def "parameterized test"() {
        given:
        def calc = new Calculator(a)

        when:
        calc.add(b)

        then:
        calc.getValue() == c

        where:
        a | b | c
        1 | 1 | 2
        2 | 3 | 5
        3 | 7 | 10
    }

    @Unroll
    def "parameterized test 2"() {
        given:
        def calc = new Calculator(a)

        when:
        calc.add(b)

        then:
        calc.getValue() == c

        where:
        a << [1, 2, 3]
        b << [1, 3, 7]
        c << [2, 5, 10]
    }
}
