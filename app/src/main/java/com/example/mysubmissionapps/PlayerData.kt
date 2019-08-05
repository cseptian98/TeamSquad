package com.example.mysubmissionapps

object PlayerData{
    private var data = arrayOf(
        arrayOf(
            "Marcus Rashford",
            "Forward",
            "https://www.rakyatsulsel.co/wp-content/uploads/2019/07/Marcus-Rashford.jpg",
            "\"I HAVE ALWAYS BEEN A UNITED FAN, SO TO BE PLAYING IN THE FIRST TEAM REALLY IS A DREAM COME TRUE.\"",
            "England",
            "31 October 1997"
        ),
        arrayOf(
            "Alexis Sanchez",
            "Forward",
            "https://www.manutd.com/AssetPicker/images/0/0/12/34/795342/Alexis_Sanchez_Home_0441-11562747193881_large.jpg",
            "\"IT'S A DREAM TO PLAY FOR UNITED. I LOOKED AT THE BADGE AND MY HAIRS JUST STOOD UP ON END.\"",
            "Chile",
            "19 December 1988"
        ),
        arrayOf(
            "Anthony Martial",
            "Forward",
            "http://www.standardmedia.co.ke/images/tuesday/thumb_anthony_martial_give5c0f64c1f11d7.jpg",
            "\"I LOVE MANCHESTER UNITED, I LOVE THE FANS, THEY GIVE ME A LOT OF JOY.\"",
            "France",
            "5 December 1995"
        ),
        arrayOf(
            "Paul Pogba",
            "Midfielder",
            "https://www.thesportreview.com/wp-content/uploads/paul-pogba-1200.jpg",
            "\"I WANT TO BE THE MIDFIELDER WHO CAN DO EVERYTHING, AND AT THE HIGHEST LEVELS: SHOOT, DRIBBLE, SCORE, DEFEND.\"",
            "France",
            "15 March 1993"
        ),
        arrayOf(
            "Nemanja Matic",
            "Midfielder",
            "https://www.manutd.com/AssetPicker/images/0/0/6/209/446880/Nemanja_Matic_PORTRAIT_00511513860156670_large.jpg",
            "\"MANCHESTER UNITED IS ONE OF THE BIGGEST CLUBS IN THE WORLD AND I AM VERY HAPPY TO BE A PART OF THIS GREAT GROUP.\"",
            "Serbia",
            "1 August 1988"
        ),
        arrayOf(
            "Daniel James",
            "Midfielder",
            "https://www.ligaolahraga.com/storage/images/news/2019/06/26/usai-jadi-penggawa-mu-daniel-james-kebut-latihan.jpeg",
            "\"I THINK EVERY KID GROWS UP WANTING TO PLAY FOR MANCHESTER UNITED.\"",
            "Wales",
            "10 November 1997"
        ),
        arrayOf(
            "Aaron Wan-Bissaka",
            "Right Back",
            "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AADBOOA.img?h=468&w=624&m=6&q=60&o=f&l=f&x=849&y=538",
            "\"EVERY KID WANTS TO PLAY FOR A TEAM LIKE THIS. IT'S AN HONOUR TO REPRESENT THIS CLUB.\"",
            "England",
            "26 November 1997"
        ),
        arrayOf(
            "Eric Bailly",
            "Defender",
            "https://cdn.idntimes.com/content-images/community/2019/04/y8-4dbe6044b9d7772ca5af7e51dd87bfa9_600x400.jpg",
            "\"TO PLAY FOOTBALL AT THE HIGHEST LEVEL IS ALL I HAVE EVER WANTED TO DO.\"",
            "Ivory Coast",
            "12 April 1994"
        ),
        arrayOf(
            "Chris Smalling",
            "Defender",
            "https://images.performgroup.com/di/library/GOAL/83/d6/chris-smalling-manchester-united_1rottwsjb0lt51m9p4rs4n7oku.jpg?t=-674953216&quality=100",
            "\"I AM SO PROUD TO PLAY FOR SUCH A GREAT CLUB.\"",
            "England",
            "22 November 1989"
        ),
        arrayOf(
            "Luke Shaw",
            "Left Back",
            "https://www.sepakbola.com/wp-content/uploads/2017/02/luke-shaw-daily-star.jpg",
            "\"I’VE GOT THE FREEDOM TO PLAY AND THAT GIVES ME THE CONFIDENCE IN WHAT I WANT TO DO TO HELP THE TEAM.\"",
            "England",
            "12 July 1995"
        ),
        arrayOf(
            "De Gea",
            "Manchester United",
            "https://e0.365dm.com/19/07/768x432/skysports-david-de-gea-manchester_4725404.jpg?20190722150258",
            "\"I DON’T KNOW WHO IS THE BEST GOALKEEPER IN THE WORLD AT THE MOMENT, BUT I WANT TO BE THE BEST.\"",
            "Spain",
            "7 November 1990"
        )
    )

    val listData: ArrayList<Player>
        get() {
            val list = ArrayList<Player>()
            for (aData in data) {
                val player = Player()
                player.name = aData[0]
                player.position = aData[1]
                player.photo = aData[2]
                player.talk = aData[3]
                player.country = aData[4]
                player.birth = aData[5]
                list.add(player)
            }
            return list
        }
}