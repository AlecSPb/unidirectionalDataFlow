package com.odai.architecturedemo.favourite.usecase

import com.odai.architecturedemo.cat.model.Cat
import com.odai.architecturedemo.event.Event
import com.odai.architecturedemo.favourite.model.FavouriteCats
import rx.Observable

interface FavouriteCatsUseCase {

    fun getFavouriteCatsEvents(): Observable<Event<FavouriteCats>>

    fun getFavouriteCats(): Observable<FavouriteCats>

    fun addToFavourite(cat: Cat)

    fun removeFromFavourite(cat: Cat)

}
