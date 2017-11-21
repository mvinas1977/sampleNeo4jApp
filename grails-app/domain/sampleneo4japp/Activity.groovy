package sampleneo4japp

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Activity extends BaseBean {

    String description

    Person owner
    Category category

    static belongsTo = [owner: Person]

    static constraints = {

    }

    static mapping = {
        owner fetch:"eager"
    }
}
