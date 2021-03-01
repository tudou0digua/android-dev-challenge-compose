/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
