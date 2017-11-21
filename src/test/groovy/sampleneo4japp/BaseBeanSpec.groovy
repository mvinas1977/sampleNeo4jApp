package sampleneo4japp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BaseBeanSpec extends Specification implements DomainUnitTest<BaseBean> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
