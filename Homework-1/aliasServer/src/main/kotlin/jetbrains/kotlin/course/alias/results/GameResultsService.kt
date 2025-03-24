package jetbrains.kotlin.course.alias.results

import org.springframework.stereotype.Service
import java.util.ArrayList

@Service
class GameResultsService {
    private val gameResults = ArrayList<GameResult>()

    fun saveGameResults(result: GameResult) {
        gameResults.add(result)
    }

    fun getAllGameResults(): List<GameResult> {
        return gameResults.toList()
    }
}
