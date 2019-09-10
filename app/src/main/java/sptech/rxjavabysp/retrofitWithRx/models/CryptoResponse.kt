package sptech.rxjavabysp.retrofitWithRx.models

data class CryptoResponse(
        val Data: List<Data>,
        val HasWarning: Boolean,
        val Message: String,
        val RateLimit: RateLimit,
        val SponsoredData: List<Any>,
        val Type: Int
)











