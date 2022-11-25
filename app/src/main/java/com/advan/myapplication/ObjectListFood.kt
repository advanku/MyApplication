package com.advan.myapplication

object ObjectListFood {
    private val listName = arrayListOf(
        "Ayam geprek",
        "Mie pedas",
        "Kebab original",
        "Kebab sosis deluxe",
        "Ayam geprek",
        "Mie pedas",
        "Kebab original",
        "Kebab sosis deluxe"
    )
    private val listDescription = arrayListOf(
        "Ayam geprek pedas level 3",
        "Mie Pedas Jumbo dengan extra toping sosis melimpah",
        "Kebab Turki ASli",
        "Pengen Kebab dengan sosis jumbo? kebab sosis deluxe jawabannya",
        "Ayam geprek pedas level 3",
        "Mie Pedas Jumbo dengan extra toping sosis melimpah",
        "Kebab Turki ASli",
        "Pengen Kebab dengan sosis jumbo? kebab sosis deluxe jawabannya"
    )
    private val listPrice = arrayListOf(
        22000,
        15000,
        12000,
        170000,
        22000,
        15000,
        12000,
        170000
    )
    private val listImage = arrayListOf(
        R.drawable.resep_ayam_geprek_jogja,
        R.drawable.mie_pedas,
        R.drawable.kebab,
        R.drawable.kebab_sosis,
        R.drawable.resep_ayam_geprek_jogja,
        R.drawable.mie_pedas,
        R.drawable.kebab,
        R.drawable.kebab_sosis
    )
    val listMenu: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (i in 0 until listName.size) {
                val food = Food()
                food.name = listName[i]
                food.descritiption = listDescription[i]
                food.price = listPrice[i]
                food.image = listImage[i]
                list.add(food)
            }
            return list
        }
}