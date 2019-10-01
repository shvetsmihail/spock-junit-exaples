package example

import spock.lang.Specification

class Example4ClosureSpockTest extends Specification {
    def "closure test"() {
        given: "create mock for CalculatorService"
        def calcService = Mock(CalculatorService)
        def calcServiceWrapper = new CalculatorServiceWrapper(calcService)

        when: "adding 2 and 3"
        def result = calcServiceWrapper.addAndGet(2, 3)

        then: "programming calculatorService behavior"
//        1 * calcService.addAndGet(new Calculator(2), 3) >> 5
//        1 * calcService.addAndGet({ it.value == 2}, 3) >> 5
        1 * calcService.addAndGet({ Calculator calc -> calc.value == 2}, 3) >> 5

        and: "checking the result"
        result == 5
    }
}
