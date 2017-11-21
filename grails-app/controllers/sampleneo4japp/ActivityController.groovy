package sampleneo4japp

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class ActivityController {

    def index() {
        respond Activity.list()
    }

    def show(String description) {
        Activity activity = Activity.findByDescription(description)
        respond activity
    }

    def showFull(String description) {
        Activity activity = Activity.findByDescription(description)
        respond activity
    }
}
