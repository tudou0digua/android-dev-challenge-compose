package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.CatModel
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

class DetailActivity : AppCompatActivity() {
    companion object {
        const val PARAM_MODEL = "model"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model = intent.getSerializableExtra(PARAM_MODEL) as CatModel
        setContent {
            MyTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CatDetail(model = model)
                }
            }
        }
    }

    @Composable
    fun CatDetail(model: CatModel) {
        Column {
            Image(modifier = Modifier
                .clickable { finish() }
                .padding(horizontal = 16.dp, vertical = 10.dp),
                painter = painterResource(id = R.drawable.nav_icon_back_black_nor),
                contentDescription = "back")
            Column(
                modifier = Modifier.padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {

                Image(
                    modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = model.pic),
                    contentDescription = "cat pic",
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Name: ", style = typography.h6)
                Text(text = model.name, style = typography.body1)
                Text(text = "Detail: ", style = typography.h6)
                Text(text = model.desc, style = typography.body1)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        val model = CatModel(
            name = "kitty",
            desc = "beautiful little cat. it is name is kitty.",
            pic = R.drawable.cat_1
        )

        MyTheme {
            CatDetail(model = model)
        }
    }
}