package com.kuronekos.marvelheroes

object CharactersData {
    private val charNames = arrayOf(
        "Iron Man",
        "Thanos",
        "Captain America",
        "Ultron",
        "Thor Odinson",
        "Hela Odinsdottir",
        "Doctor Strange",
        "Dormammu",
        "Black Panther",
        "Namor"
    )
    private val charRoles = arrayOf(
        "Heroes",
        "Villain",
        "Heroes",
        "Villain",
        "Heroes",
        "Villain",
        "Heroes",
        "Villain",
        "Heroes",
        "Villain"
    )
    private val charImages = intArrayOf(
        R.drawable.ironman,
        R.drawable.thanos,
        R.drawable.captain_america,
        R.drawable.ultron,
        R.drawable.thor,
        R.drawable.hela,
        R.drawable.doctor_strange,
        R.drawable.dormammu,
        R.drawable.black_panther,
        R.drawable.namor,
    )
    private val charDetails = arrayOf(
        "Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968). Also in 1963, the character founded the Avengers alongside Thor, Ant-Man, Wasp and the Hulk.",
        "Thanos is a fictional supervillain appearing in American comic books published by Marvel Comics. The character was created by writer-artist Jim Starlin, and made his first appearance in The Invincible Iron Man #55 (cover dated February 1973). Thanos is one of the most powerful villains in the Marvel Universe and has clashed with many heroes including the Avengers, the Guardians of the Galaxy, the Fantastic Four, and the X-Men.",
        "Captain America is a fictional superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period",
        "Ultron is a fictional supervillain appearing in American comic books published by Marvel Comics. A self-aware and highly intelligent robot created by Hank Pym, the character is usually depicted as a dark reflection of his creator and harbors a strong grudge against him. Ultron's goal to destroy humanity has often brought him into conflict with the Avengers, who always managed to thwart and destroy him, but he would return time and time again",
        "Thor Odinson is a fictional superhero appearing in American comic books published by Marvel Comics. The character, which is based on the Norse deity of the same name, is the Asgardian god of thunder who possesses the enchanted hammer, Mjolnir, which grants him the ability to fly and manipulate weather amongst his other superhuman attributes. Thor is incredibly long-lived and relies upon periodic consumption of the Golden Apples of Idunn to sustain his extended lifespan.",
        "Hela Odinsdottir was the Asgardian goddess of death and former executioner of Asgard. Imprisoned in Hell for millennia by her father Odin, Hela was only released from her prison in the wake of his death and went to restore her power over Asgard, while simultaneously engaging in a series of encounters with her younger brothers Thor and Loki. Hela planned to rule Asgard and create an Asgardian Empire. Hela set about massacring Odin's armies and enslaving their people.",
        "Doctor Stephen Strange is a fictional character appearing in American comic books published by Marvel Comics. The character first appeared in Strange Tales #110. Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.",
        "Dormammu is a fictional character appearing in American comic books published by Marvel Comics. The character first appeared in Strange Tales #126, and was created by Stan Lee and Steve Ditko. After being established as the ruler of an alternate dimension (later described as the god-tyrant of its denizens), Dormammu became a perennial foe of Sorcerer Supreme Doctor Strange, who until this time had dealt almost exclusively with off-beat \"one-off\" mystical threats.",
        "Black Panther is a fictional superhero appearing in Marvel Comics. Black Panther's real name is T'Challa, he is depicted as the king of the fictional African nation of Wakanda. Along with possessing enhanced abilities achieved through ancient Wakandan rituals of drinking the essence of the heart-shaped herb, T'Challa also relies on his proficiency in science, rigorous physical training, hand-to-hand combat skills, and access to wealth and advanced Wakandan technology to combat his enemies.",
        "Namor the Sub-Mariner is a fictional character appearing in American comic books published by Marvel Comics. Debuting in early 1939, the character was created by writer-artist Bill Everett for comic book packager Funnies Inc. Initially created for the unreleased comic Motion Picture Funnies Weekly, the character first appeared publicly in Marvel Comics #1, which was the first comic book from Timely Comics, the 1930s–1940s predecessor of Marvel Comics."
    )

    val listData: ArrayList<Character>
        get() {
            val list = arrayListOf<Character>()
            for (position in charNames.indices) {
                val character = Character()
                character.name = charNames[position]
                character.role = charRoles[position]
                character.detail = charDetails[position]
                character.photo = charImages[position]
                list.add(character)
            }
            return list
        }
}