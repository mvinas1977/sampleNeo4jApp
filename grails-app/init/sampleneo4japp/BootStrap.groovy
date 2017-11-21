package sampleneo4japp

class BootStrap {

    def init = { servletContext ->

        Activity.withNewSession {
            Activity.withNewTransaction {
                Activity activity1 = Activity.findByDescription('Activity 1')

                if (!activity1) {

                    Person person1 = new Person(name: 'Person1')
                    Person person2 = new Person(name: 'Person2')

                    person1.save()
                    person2.save()

                    Category category = new Category(name: 'Category 1')
                    category.save()

                    Activity activity = new Activity(description: 'Activity 1', owner: person1, category: category)
                    Activity activity2 = new Activity(description: 'Activity 2', owner: person1, category: category)
                    Activity activity3 = new Activity(description: 'Activity 3', owner: person2, category: category)

                    activity.save()
                    activity2.save()
                    activity3.save()

                    log.debug("Created initial data.")
                }
            }
        }

    }

    def destroy = {

    }
}
