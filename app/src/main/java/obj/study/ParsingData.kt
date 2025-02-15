import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ParsingData(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    @ColumnInfo val queryCost: Long = 0,
    @ColumnInfo val latitude: Double = 0.0,
    @ColumnInfo val longitude: Double = 0.0,
    @ColumnInfo val resolvedAddress: String = "",
    @ColumnInfo val address: String = "",
    @ColumnInfo val timezone: String = "",
    @ColumnInfo val tzoffset: Double = 0.0,
    @ColumnInfo val description: String = "",
    @ColumnInfo val days: List<Day> = emptyList(),
    @ColumnInfo val alerts: List<Any?> = emptyList(),
    @ColumnInfo val stations: Stations = Stations(),
    @ColumnInfo val currentConditions: CurrentConditions = CurrentConditions(),
)

data class Day(
    val datetime: String = "",
    val datetimeEpoch: Long = 0,
    val tempmax: Double = 0.0,
    val tempmin: Double = 0.0,
    val temp: Double = 0.0,
    val feelslikemax: Double = 0.0,
    val feelslikemin: Double = 0.0,
    val feelslike: Double = 0.0,
    val dew: Double = 0.0,
    val humidity: Double = 0.0,
    val precip: Double = 0.0,
    val precipprob: Double = 0.0,
    val precipcover: Double = 0.0,
    val preciptype: List<String> = emptyList(),
    val snow: Double = 0.0,
    val snowdepth: Double = 0.0,
    val windgust: Double = 0.0,
    val windspeed: Double = 0.0,
    val winddir: Double = 0.0,
    val pressure: Double = 0.0,
    val cloudcover: Double = 0.0,
    val visibility: Double = 0.0,
    val solarradiation: Double = 0.0,
    val solarenergy: Double = 0.0,
    val uvindex: Double = 0.0,
    val severerisk: Double = 0.0,
    val sunrise: String = "",
    val sunriseEpoch: Long = 0,
    val sunset: String = "",
    val sunsetEpoch: Long = 0,
    val moonphase: Double = 0.0,
    val conditions: String = "",
    val description: String = "",
    val icon: String = "",
    val stations: List<String> = emptyList(),
    val source: String = "",
    val hours: List<Hour> = emptyList<Hour>(),
)

data class Hour(
    val datetime: String = "",
    val datetimeEpoch: Long = 0,
    val temp: Double = 0.0,
    val feelslike: Double = 0.0,
    val humidity: Double = 0.0,
    val dew: Double = 0.0,
    val precip: Double = 0.0,
    val precipprob: Double = 0.0,
    val snow: Double = 0.0,
    val snowdepth: Double = 0.0,
    val preciptype: List<String>? = emptyList(),
    val windgust: Double = 0.0,
    val windspeed: Double = 0.0,
    val winddir: Double = 0.0,
    val pressure: Double = 0.0,
    val visibility: Double = 0.0,
    val cloudcover: Double = 0.0,
    val solarradiation: Double = 0.0,
    val solarenergy: Double = 0.0,
    val uvindex: Double = 0.0,
    val severerisk: Double = 0.0,
    val conditions: String = "",
    val icon: String = "",
    val stations: List<String>? = emptyList(),
    val source: String = "",
)

data class Stations(
    val untt: Untt = Untt(),
)

data class Untt(
    val distance: Double= 0.0,
    val latitude: Double= 0.0,
    val longitude: Double= 0.0,
    val useCount: Long = 0,
    val id: String = "",
    val name: String = "",
    val quality: Long = 0,
    val contribution: Double = 0.0,
)

data class CurrentConditions(
    val datetime: String = "",
    val datetimeEpoch: Long = 0,
    val temp: Double = 0.0,
    val feelslike: Double = 0.0,
    val humidity: Double = 0.0,
    val dew: Double = 0.0,
    val precip: Double = 0.0,
    val precipprob: Double = 0.0,
    val snow: Double = 0.0,
    val snowdepth: Double = 0.0,
    val preciptype: List<String> = emptyList(),
    val windgust: Any? = "",
    val windspeed: Double = 0.0,
    val winddir: Double = 0.0,
    val pressure: Double= 0.0,
    val visibility: Double= 0.0,
    val cloudcover: Double= 0.0,
    val solarradiation: Double= 0.0,
    val solarenergy: Double= 0.0,
    val uvindex: Double= 0.0,
    val conditions: String ="",
    val icon: String = "",
    val stations: List<String> = emptyList(),
    val source: String = "",
    val sunrise: String = "",
    val sunriseEpoch: Long = 0,
    val sunset: String = "",
    val sunsetEpoch: Long = 0,
    val moonphase: Double = 0.0,
)
