package sampleneo4japp

class Activity {

    static mapWith = "neo4j"

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