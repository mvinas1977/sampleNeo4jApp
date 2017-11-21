package sampleneo4japp

import org.grails.datastore.gorm.neo4j.GraphPersistentEntity

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class BaseBean {

    static mapWith = "neo4j"

    static constraints = {
    }

    static mapping = {
        labels { GraphPersistentEntity pe ->
            "CI__${pe.javaClass.simpleName}"
        }
    }

    Date lastUpdated
    Date dateCreated
}
