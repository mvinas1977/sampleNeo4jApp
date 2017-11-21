package sampleneo4japp

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
