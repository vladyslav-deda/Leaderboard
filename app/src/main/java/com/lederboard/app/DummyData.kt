package com.lederboard.app

import com.lederboard.app.model.User

object DummyData {

    val regionUsers = listOf(
        User("John Doe", "john_doe", R.drawable.icon_1, 1200, true),
        User("Jane Smith", "jane_smith", R.drawable.icon_3, 1100, false),
        User("Michael Brown", "michael_brown", R.drawable.icon_5, 1000, true),
        User("Alice Johnson", "alice_johnson", R.drawable.icon_4, 900, false),
        User("Bob Williams", "bob_williams", R.drawable.icon_2, 800, true),
        User("Charlie Davis", "charlie_davis", R.drawable.icon_3, 700, false),
        User("David Martinez", "david_martinez", R.drawable.icon_4, 600, true),
        User("Eva Garcia", "eva_garcia", R.drawable.icon_5, 500, false),
        User("Frank Miller", "frank_miller", R.drawable.icon_1, 400, true),
        User("Grace Lee", "grace_lee", R.drawable.icon_2, 300, false)
    )

    val nationalUsers = listOf(
        User("Hannah Wilson", "hannah_wilson", R.drawable.icon_3, 2200, true),
        User("Ian Moore", "ian_moore", R.drawable.icon_2, 2100, false),
        User("Jack Taylor", "jack_taylor", R.drawable.icon_1, 2000, true),
        User("Kathy Anderson", "kathy_anderson", R.drawable.icon_5, 1900, false),
        User("Larry Thomas", "larry_thomas", R.drawable.icon_4, 1800, true),
        User("Mia Jackson", "mia_jackson", R.drawable.icon_2, 1700, false),
        User("Nathan White", "nathan_white", R.drawable.icon_3, 1600, true),
        User("Olivia Harris", "olivia_harris", R.drawable.icon_1, 1500, false),
        User("Peter Martin", "peter_martin", R.drawable.icon_4, 1400, true),
        User("Quincy Thompson", "quincy_thompson", R.drawable.icon_5, 1300, false)
    )

    val globalUsers = listOf(
        User("Rebecca Garcia", "rebecca_garcia", R.drawable.icon_5, 3200, true),
        User("Samuel Martinez", "samuel_martinez", R.drawable.icon_2, 3100, false),
        User("Tina Robinson", "tina_robinson", R.drawable.icon_3, 3000, true),
        User("Uma Clark", "uma_clark", R.drawable.icon_4, 2900, false),
        User("Victor Rodriguez", "victor_rodriguez", R.drawable.icon_5, 2800, true),
        User("Wendy Lewis", "wendy_lewis", R.drawable.icon_1, 2700, false),
        User("Xander Lee", "xander_lee", R.drawable.icon_4, 2600, true),
        User("Yvonne Walker", "yvonne_walker", R.drawable.icon_2, 2500, false),
        User("Zachary Hall", "zachary_hall", R.drawable.icon_3, 2400, true),
        User("Ava Young", "ava_young", R.drawable.icon_1, 2300, false)
    )
}