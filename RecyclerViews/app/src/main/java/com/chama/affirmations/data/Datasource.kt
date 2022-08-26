package com.chama.affirmations.data

import com.chama.affirmations.R
import com.chama.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://web-japan.org/trends/11_fashion/images/fas201910_hokusai04.jpg"),
            Affirmation(R.string.affirmation2, "https://web-japan.org/trends/11_fashion/images/fas201910_hokusai01.jpg"),
            Affirmation(R.string.affirmation3, "https://web-japan.org/trends/11_fashion/images/fas201910_hokusai05.jpg"),
            Affirmation(R.string.affirmation4, "https://web-japan.org/trends/11_fashion/images/fas201910_hokusai06.jpg"),
            Affirmation(R.string.affirmation5, "https://www.epdlp.com/fotos/hokusai1.jpg"),
            Affirmation(R.string.affirmation6, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/%27Nandina_and_Rooster%27_from_the_%27Colorful_Realm_of_Living_Beings%27_by_Ito_Jakuchu.jpg/800px-%27Nandina_and_Rooster%27_from_the_%27Colorful_Realm_of_Living_Beings%27_by_Ito_Jakuchu.jpg"),
            Affirmation(R.string.affirmation7, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Chrysanthemums_by_a_stream_with_rocks.jpg/800px-Chrysanthemums_by_a_stream_with_rocks.jpg"),
            Affirmation(R.string.affirmation8, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Museum_of_the_Imperial_Collections_001.jpg/800px-Museum_of_the_Imperial_Collections_001.jpg"),
            Affirmation(R.string.affirmation9, "https://www.japansociety.org.uk/usercontent/754b15c9efd5bd4d3bca74aed6658f87/jakuchu-collage.jpeg"),
            Affirmation(R.string.affirmation10, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/%27Fish%27_from_the_%27Colorful_Realm_of_Living_Beings%27_by_Ito_Jakuchu.jpg/800px-%27Fish%27_from_the_%27Colorful_Realm_of_Living_Beings%27_by_Ito_Jakuchu.jpg"),
        )
    }
}