package com.example.androiddevchallenge.util

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.CatModel

/**
 * DataUtil
 * Author: ChenBin
 * Time: 2021-03-01
 */
object DataUtil {

    fun mockList(): ArrayList<CatModel> {
        val picArray = intArrayOf(
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
            R.drawable.cat_6,
            R.drawable.cat_7,
            R.drawable.cat_8,
            R.drawable.cat_9,
            R.drawable.cat_10,
            R.drawable.cat_11,
            R.drawable.cat_12,
        )

        val list = ArrayList<CatModel>()

        for (i in 0..11) {
            list.add(
                CatModel(
                    name = "kitty $i",
                    desc = "beautiful little cat. it is name is kitty $i.",
                    pic = picArray[i]
                )
            )
        }

        return list
    }
}