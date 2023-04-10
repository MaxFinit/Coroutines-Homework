package otus.homework.coroutines

import retrofit2.Response
import retrofit2.http.GET

interface CatsService {

    @GET("fact")
    suspend fun getCatFact() : Response<Fact>

    @GET("https://cataas.com/cat?json=true")
    suspend fun getCatPic() : Response<Pic>


}