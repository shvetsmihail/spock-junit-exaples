package example

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Example5SetupSpockTest extends Specification {
    @Shared
    def a
    def b

    def setupSpec() {
        println("setupSpec method start: a=${a}")
        a = 1
        println("setupSpec method finish: a=${a}")
    }

    def setup() {
        println("setup method start: a=${a} b=${b}")
        b = 2
        println("setup method finish: a=${a} b=${b}")
    }

    def cleanup() {
        println("cleanup method start: a=${a} b=${b}")
        b = 0
        println("cleanup method finish: a=${a} b=${b}")
    }

    def cleanupSpec() {
        println("cleanupSpec method start: a=${a}")
        a = 0
        println("cleanupSpec method finish: a=${a}")
    }

    @Unroll
    def "test"() {
        println("running test")

        given:
        def c = 3
        println("this is given")

        when:
        def a_plus_b = a + b
        println("this is when")

        then:
        a_plus_b == c
        println("this is then")

        and:
        c <= d
        println("this is and")

        where:
        d << [3, 4]
    }
}
