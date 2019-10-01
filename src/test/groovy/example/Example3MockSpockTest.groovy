package example

import spock.lang.Specification

class Example3MockSpockTest extends Specification {
    def "mock test"() {
        given: "create mock with default value for Calculator"
        def calcService = new CalculatorService()
        def calc = Mock(Calculator)

        when: "adding 3 to calculator mock object"
        def result = calcService.addAndGet(calc, 3)

        then: "programming calculator behavior"
        1 * calc.add(3)
        1 * calc.getValue() >> 5

        and: "checking the result"
        result == 5
    }

    def "mock test 2"() {
        given: "create mock and programming behavior for Calculator"
        def calc = Mock(Calculator) {
            getValue() >> 5
        }
        def calcService = new CalculatorService()

        when: "adding 3 to calculator mock object"
        def result = calcService.addAndGet(calc, 3)

        then: "checking the result"
        result == 5
    }

    def "mock test 3"() {
        given: "create mock and programming behavior in array for Calculator"
        def calc = Mock(Calculator) {
            getValue() >>> [5, 10]
        }
        def calcService = new CalculatorService()

        expect:
        calcService.addAndGet(calc, 0) == 5
        calcService.addAndGet(calc, 0) == 10
    }
}
